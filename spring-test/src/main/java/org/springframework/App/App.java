package org.springframework.App;

import org.springframework.Bean.Enjoy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.springframework.Bean")
@Enjoy
public class App {
	public static void main(String[] args) {
	}
}
