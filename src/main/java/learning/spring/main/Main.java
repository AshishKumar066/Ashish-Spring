package learning.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learning.spring.model.Employee;

//Step:1  add dependencies ( mvnreposatory :- spring core & spring context) 

public class Main {

	public static void main(String[] args) {
//											(String......... basepackage); it is use for explore all classes available in project and if any class show anothation @Component then create self beans  
		ApplicationContext ioc = new AnnotationConfigApplicationContext(learning.spring.model.Employee.class,learning.spring.model.Address.class,learning.spring.model.Address2.class);

		Employee bean1 = ioc.getBean("employee", Employee.class);
		System.out.println(bean1);

		bean1.setName("Ashish Kumar");
		System.out.println(bean1);
		
		System.out.println(".................................................");
		bean1.setGender("Male");
		System.out.println(bean1);

	}

}
