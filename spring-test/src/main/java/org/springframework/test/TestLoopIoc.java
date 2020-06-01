package org.springframework.test;

import org.springframework.App.App;
import org.springframework.Bean.ExtentMapperTest;
import org.springframework.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLoopIoc {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringApplication.class);
		ExtentMapperTest extentMapperTest = (ExtentMapperTest)applicationContext.getBean("extentMapperTest");
		extentMapperTest.test(11);
	}
}
