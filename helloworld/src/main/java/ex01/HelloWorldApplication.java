package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/*
 * Bootstrapping class
 * 
 * 1. 스프링부트 애플리케이션의 부트스트래핑(Bootstrapping)
 * 2. 설정 클래스로 역할(Configuration Class)
 */
@SpringBootApplication
//@ComponentScan()
//@Import({})
public class HelloWorldApplication {
	public static void main(String[] args) {
		/*
		 *1. 애플리케이션 컨텍스트(appliciation context, spring containner)생성 
		 *2.  웹 애플리케이션 타입(Web Aookucation인 경우, MVC or Reactive 타입 설정)-> was 때문
		 *3. 어노테이션 스캐닝(auto) or Configuration Class(Explicit) 통한 빈 생성/등록 및 와이어링
		 *4. 웹 어플리케이션(MVC)
		 *		-내장(embeded) 서버(TomcatEmdeddedServletContainer)
		 *		-서버 인스턴스 웹애플리케이션을 배포
		 *		-서버 인스턴스 실행
		 *5. ApplicationRunner 인터페이스를 구현한 빈을 찾아서 실행(run 호출)
		 *
		 */
//		ConfigurableApplicationContext c=null;
//		try {
//			c=SpringApplication.run(HelloWorldApplication.class, args);
//		}catch(Throwable ex) {
//			ex.printStackTrace();
//		}finally {
//			c.close();
//		}

		//try~with~resource
		try(ConfigurableApplicationContext c=SpringApplication.run(HelloWorldApplication.class, args)){
			
		}
	}
}
