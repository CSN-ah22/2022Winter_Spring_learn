package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello(controller value)testest"); //key, value
        return "hello"; //html로 model과 함께 전환
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name); //html로 전달
        return "hello-template";
    }

    //API - html 없이 바로 결과 보기 가능
    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello" + name;
    }

    @GetMapping("hello-api") //자동 닫기 ctrl+shift+enter
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static  class Hello {
        private String name;
        // alt + insert -> getter , setter 단축키

        //spring이 자동으로 json으로 변환하고 요청에 응답함 그래서 getter가 없어도 잘굴러 가는듯
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

}
