package org.springframework.test;

import org.springframework.App.App;
import org.springframework.Bean.JdkProxyInterface;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLoopIoc {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(App.class);
		JdkProxyInterface bean = ac.getBean(JdkProxyInterface.class);
		bean.aopProxy();
	}
}
