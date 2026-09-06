package learning.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import learning.spring.model.Employee;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");

		Employee bean = ioc.getBean("emp1", Employee.class);
		System.out.println(bean);

		ioc.registerShutdownHook();
	}

}
