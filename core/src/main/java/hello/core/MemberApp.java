package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
/*        AppConfig appConfig = new AppConfig();
        // 궁금한 점 : 이와 같이 할당하면 이것은 OCP,DIP 원칙을 잘 지킨 코드인가? 내가 볼때는 여전히 구현체에 의존하고 있는 것 같은데
        MemberService memberService = appConfig.memberService();*/

        // ApplicationContext : 스프링 컨테이너라 보면된다.
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        Member member = new Member(1L, "memberA", Grade.VIP);
        // 회원가입
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("findMember = " + findMember.getName());
        System.out.println("member = " + member.getName());
    }
}