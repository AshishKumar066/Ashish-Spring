package learning.spring.model;


// POJO Class ---------------------------------

public class Address {
	private String city;
	private String state;
	
	
	public Address() {
		
		System.out.println("Address.Address()");
	}


	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
		System.out.println("Address.Address(2)");
		
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
		System.out.println("Address.setCity()");
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
		System.out.println("Address.setState()");
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	 
	



}
