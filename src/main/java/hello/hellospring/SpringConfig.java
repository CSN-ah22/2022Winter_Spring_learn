package hello.hellospring;

import hello.hellospring.Service.MemberService;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* 직접 자바 빈 설정하기
* MemberService 의 @AutoWried 와 @Service를 지운다
* MemberRepository의 @Repository를 지운다
* 아래 컴포넌트 스캔 태그들을 차례대로 활성화 한다
*
*/

//@Configuration
public class SpringConfig {
/*    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }*/
}
