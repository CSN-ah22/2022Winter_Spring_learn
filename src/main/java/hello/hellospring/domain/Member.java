package hello.hellospring.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity     // JPA 가 관리하도록 지정 및 ORM 매핑
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK연결
    private Long id; //데이터를 구별하기 위한  시스템 id
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
