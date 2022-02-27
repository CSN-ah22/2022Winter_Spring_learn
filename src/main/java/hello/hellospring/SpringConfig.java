package hello.hellospring;

import hello.hellospring.Service.MemberService;
import hello.hellospring.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;
import javax.swing.*;
import javax.xml.crypto.Data;

/*
* 직접 자바 빈 설정하기
* MemberService 의 @AutoWried 와 @Service를 지운다
* MemberRepository의 @Repository를 지운다
* 아래 컴포넌트 스캔 태그들을 차례대로 활성화 한다
*
*/

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

/*    @Bean
    public MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//        MemoryMemberRepository 가 아닌 JdbcMemberRepository를 반환해줌으로써 의존성 성립(DI)
//        return new JdbcMemberRepository(dataSource);
//        return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);

    }*/
}
