package spring.boot.web;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringBootWebRestfulCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebRestfulCrudApplication.class, args);
	}
	
}
