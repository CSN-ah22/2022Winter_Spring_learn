package hello.hellospring.controller;

import hello.hellospring.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    // service의 기능을 다른 곳에서도 활용하므로(ex.주문시, 결제시) 객체를 공용으로 만드는것이 좋다 == new를 사용하지 말것
    private final MemberService memberService;

    //@Autowired - 공용 연결을 해주는것 - @Service 지정 필요
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
