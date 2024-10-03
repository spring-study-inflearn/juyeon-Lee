package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) // 어디에 붙는 어노테이션인지 결정, TYPE : 클래스에 붙는 어노테이션
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {

}
