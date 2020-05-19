package org.springframework.Bean;

import java.lang.reflect.Proxy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class EnjoyBeanPostProcess implements BeanPostProcessor {


	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("definitionA".equals(beanName)) {
			Class<?>[] interfaces = bean.getClass().getInterfaces();
			System.out.println("Generete definitonA proxy object");
			return Proxy.newProxyInstance(EnjoyBeanPostProcess.class.getClassLoader(), interfaces, new DefinitionHandler(bean));
		}
		return bean;
	}
}
