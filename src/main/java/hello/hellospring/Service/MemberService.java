package hello.hellospring.Service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository;
    //DI (test와 같은 인스턴스 사용)
    public MemberService(MemberRepository memberRepository){ //외부에서 넣어지도록
        this.memberRepository = memberRepository;
    }

    /*
    * 회원 가입
    */

    public Long join(Member member) {
        validateDuplicateMember(member); //중복 회원 검증
        memberRepository.save(member);
        return member.getId();
    }

    //자동 변수 생성 단축키 ctrl + alt + v
    private void validateDuplicateMember(Member member) {
        //null일 경우 Optional로 감싸서 반환해줌
        //Optional 관련 메서드인 ifPresent 실행
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {// 값이 있을경우 해당 기능 실행
                    throw new IllegalStateException("이미 존재하는 회원입니다");
            });
    }

    /*
    * 전체 회원 조회
    *
    */
    public List<Member> findMembers(){
            return memberRepository.findAll();
    }

    /*
    * 일부 회원 조회
    *
    */
    public Optional<Member> findOne(Long memberId){
        return  memberRepository.findById(memberId);
    }
}
