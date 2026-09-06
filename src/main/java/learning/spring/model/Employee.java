package learning.spring.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Employee implements InitializingBean, DisposableBean {
	private int id;
	private String name;
	private String gender;

	private Address address;

	public Employee() {
		System.out.println("Employee.Employee()");

	}

	public Employee(int id, String name, String gender, Address address) {

		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;

		System.out.println("Employee.Employee()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Employee.destroy()");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Employee.afterPropertiesSet()");

	}

	private void xmlInitMethod() {
		System.out.println("Employee.xmlInitMethod()");

	}

	private void xmlDestroyMethod() {
		System.out.println("Employee.xmlInitMethod()");

	}

	public int getId() {
		return id;
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setId(int id) {
		System.out.println("Employee.setId()");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Employee.setName()");
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		System.out.println("Employee.setGender()");
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}

}
