package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemoryMemberRepository implements MemberRepository {

    //저장소 생성
    private static Map<Long, Member> store = new HashMap<>(); //동시성 문제?
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        //루프를 돌면서 member.getName()값이 넘어온 매개변수와 같은지 필터링 없으면 null 반환
        return store.values().stream()
                .filter(member ->  member.getName().equalsIgnoreCase(name)) //람다?
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        // store에 있는 값들을 루프 돌면서 반환해줌
        return new ArrayList<>(store.values());
    }

    public void clearStore(){ //test가 끝난후 저장소 클린시켜주기
        store.clear();
    }
}
