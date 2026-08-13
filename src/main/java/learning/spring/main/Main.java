package learning.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import learning.spring.model.Employee;

//Step:1  add dependencies ( mvnreposatory :- spring core & spring context) 

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
		Employee bean = ioc.getBean(Employee.class);
		
		System.out.println(bean);
		
		
		
		
	}

}
