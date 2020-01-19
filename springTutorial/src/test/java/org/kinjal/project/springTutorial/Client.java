package org.kinjal.project.springTutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	private static ApplicationContext factory;

	public static void main(String[] args) {
		
		factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung obj = factory.getBean(Samsung.class);
		obj.getPhone();
	}
}
