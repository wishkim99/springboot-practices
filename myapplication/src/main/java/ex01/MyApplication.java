package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration //안달아주면 주입을 못함
@SpringBootConfiguration
public class MyApplication {
	@Bean //자바 명시적 설정
	public MyComponent myComponent() {
		return new MyComponent();
	}
	public static void main(String[] args) {
		try (ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)) {
		}
	}
}
