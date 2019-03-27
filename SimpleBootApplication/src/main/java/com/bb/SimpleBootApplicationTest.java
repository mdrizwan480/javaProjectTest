package com.bb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bb.beans.Motor;

@SpringBootApplication(scanBasePackages= {"com.bb.beans"})
public class SimpleBootApplicationTest {
	public static void main(String[] args) {

	ApplicationContext context=SpringApplication.run(SimpleBootApplicationTest.class, args);
	Motor motor=context.getBean("motor",Motor.class);
	System.out.println(motor);
	}
}
