package learning.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import learning.spring.main.DatabaseSingleton;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");

		DatabaseSingleton obj1 = ioc.getBean("dbSingleton", DatabaseSingleton.class);
		DatabaseSingleton obj2 = ioc.getBean("dbSingleton", DatabaseSingleton.class);
		DatabaseSingleton obj3 = ioc.getBean("dbSingleton", DatabaseSingleton.class);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		

	}

}
