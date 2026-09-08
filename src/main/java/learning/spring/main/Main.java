package learning.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import learning.spring.model.Address;
import learning.spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
		Employee obj = (Employee) ioc.getBean("empA");
		System.out.println(obj);
		
		obj.setAddress(obj.applyAddress());
		System.out.println(obj);
		
		Address a1 = obj.applyAddress();
		System.out.println(a1);
	

	}

}
