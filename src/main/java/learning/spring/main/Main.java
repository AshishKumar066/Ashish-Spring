package learning.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import learning.spring.model.Child;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
		
		Child bean = ioc.getBean("child",Child.class);
		System.out.println(bean);
	}
}
