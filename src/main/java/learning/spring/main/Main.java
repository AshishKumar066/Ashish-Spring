package learning.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import learning.spring.model.Employee;

//Step:1  add dependencies ( mvnreposatory :- spring core & spring context) 

public class Main {

	public static void main(String[] args) {

		ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");

		Employee bean1 = ioc.getBean("emp1", Employee.class);
		Employee bean2 = ioc.getBean("emp1", Employee.class);
		Employee bean3 = ioc.getBean("emp1", Employee.class);
		Employee bean4 = ioc.getBean("emp1", Employee.class);
		Employee bean5 = ioc.getBean("emp1", Employee.class);

		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean3);
		System.out.println(bean4);
		System.out.println(bean5);

	}

} 
