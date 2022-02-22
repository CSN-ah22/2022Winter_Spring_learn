package hello.hellospring.controller;

import hello.hellospring.Service.MemberService;
import hello.hellospring.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    // service의 기능을 다른 곳에서도 활용하므로(ex.주문시, 결제시) 객체를 공용으로 만드는것이 좋다 == new를 사용하지 말것
    private final MemberService memberService;

    //@Autowired - 공용 연결을 해주는것 - @Service 지정 필요
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm(){
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public  String create(MemberForm form){
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/"; //다시 홈으로 가게 만듦
    }
}
