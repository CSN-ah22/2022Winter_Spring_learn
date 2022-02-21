2022Winter_Spring_learn

<h4> 자바 코드로 직접 스프링 빈 등록하기</h4>


+ 실무에서는 주로 정형화된 컨트롤러, 서비스, 리포지토리 같은 코드는 컴포넌트 스캔을 사용한다(@Service, @Controller)
+ 정형화 되지 않거나 상황에 따라 구현 클래스를 변동할 경우 직접 스프링 빈으로 등록한다
+ 정형화된 이란 뜻은 일반적으로 우리가 만드는 컨트롤러, 서비스등을 뜻한다

주의
+ ```@Autowired```를 통한 ```DI```는 ```MemberController```, ```MemberService``` 등과 같이 스프링이 관리하는 객체에서만 동작한다 
  - -> 컴포넌트 스캔이 사용된것
+ 스프링 빈으로 등록하지 않고 내가 직접 생성한 객체에서는 동작하지 않는다
  - -> new 키워드를 이용해 생성된 인스턴스
---
<h4>기본 MVC 사용<h4>

```java
public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
    }
```
+ ```@RequestParam("name")``` -> 키(key)
+ ```String name``` -> 벨류(value)

---

http://localhost:8080/hello-static.html
+ 스프링은 기본적으로 hello-static 관련 controller를 먼저 찾는다
+ hello-static 관련 controller 가 없을때 정적 html 을 내보낸다

---

Spring 환경 설정 해주는 파일들 
+ maven - pom.xml
+ gradle - build.gradle

---

Spring 에서의 view (템플릿엔진)
+ thymeleaf

---

<br>
Spring Boot Devtools 사용법 (자동 서버재시작)<br>
https://barbera.tistory.com/47<br><br>

❕ 의존성 사용시 아래처럼 괄호로 감싸줘야 정상작동함<br>
```developmentOnly ("org.springframework.boot:spring-boot-devtools")```

---

<br>
오류 문구1 <br>
Cause: invalid source release: 11<br>
<br>

해결<br>
gradle jvm설정을 11로 올린다.<br>
setting -> build, excution, deployment -> bulid tools -> maven -> gradle -> gradle projects -> gradle jvm
<br><br>
intelij 버전 얻는 방법<br>
상단 메뉴 -> help -> about<br><br>

---

설레는 첫 설정<br><br>
<img src="https://user-images.githubusercontent.com/70833455/153721480-f0c9c8b6-7c93-4ac0-8cf0-2f112a0daa76.png" width=350 height=350>

진도 - 스프링 빈과 의존단계 마침
