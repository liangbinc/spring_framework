package org.springframework.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefinitionB {

	@Autowired
	JdkProxyInterface definitionA;
}
