package org.springframework.Bean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DefinitionHandler implements InvocationHandler {

	private Object object;

	public DefinitionHandler(Object o) {
		this.object = o;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(object);
	}
}
