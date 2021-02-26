package jbdemo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("jbdemo.test")
public class SpringBootdemoApplication {
 
	public static void main(String[] args) {
	    SpringApplication.run(SpringBootdemoApplication.class, args);
	}
}
