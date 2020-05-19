package org.springframework.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefinitionA implements JdkProxyInterface{
//	@Autowired
//	DefinitionB definitionB;

	public DefinitionA(){
		System.out.println("constructor DefinitionA");
	}

	public void query(){
		System.out.println("execut query");
	}

	@Override
	public void aopProxy() {
		System.out.println(11);
	}
}
