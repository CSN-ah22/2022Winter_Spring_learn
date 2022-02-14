2022Winter_Spring_learn

```java
public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
    }
```
+ ```@RequestParam("name")``` -> 키(key)
+ ```String name``` -> 벨류(value)

http://localhost:8080/hello-static.html
+ 스프링은 기본적으로 hello-static 관련 controller를 먼저 찾는다
+ hello-static 관련 controller 가 없을때 정적 html 을 내보낸다


Spring 환경 설정 해주는 파일들 
+ maven - pom.xml
+ gradle - build.gradle

Spring 에서의 view (템플릿엔진)
+ thymeleaf
<br>
Spring Boot Devtools 사용법 (자동 서버재시작)<br>
https://barbera.tistory.com/47<br><br>

❕ 의존성 사용시 아래처럼 괄호로 감싸줘야 정상작동함<br>
```developmentOnly ("org.springframework.boot:spring-boot-devtools")```

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

설레는 테이크아웃<br><br>
<img src="https://user-images.githubusercontent.com/70833455/153721480-f0c9c8b6-7c93-4ac0-8cf0-2f112a0daa76.png" width=350 height=350>

진도 - mvc 강의까지 마침
