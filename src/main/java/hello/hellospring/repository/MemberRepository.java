package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    // 4가지 기능 가설 설정
    Member save(Member member); //저장 기능
    Optional<Member> findById(Long id); //id 찾기
    Optional<Member> findByName(String name); // name 찾기
    List<Member> findAll(); //저장 목록 불러오기
}
