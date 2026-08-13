package learning.spring.model;


// POJO Class ---------------------------------

public class Employee {
	private int id;
	private String name;
	private String gender;
	
	
//	Dependencies of other POJO class !
	
	private Address address;

	
//	if we can't create a no argument constructor then it can bee show an acception 
	public Employee() {
		System.out.println("Employee.Employee()");
		
	}

	public Employee(int id, String name, String gender, Address address) {

		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address=address;
		
		System.out.println("Employee.Employee()");
	}

	public int getId() {
		return id;
	}

//	if we can't declare this setter then it showing an axeption 
	
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
