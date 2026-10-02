package learning.spring.model;

import org.springframework.stereotype.Component;

// POJO Class ---------------------------------

@Component
public class Address {

	private String city;
	private String State;

	public Address() {
		System.out.println("Address.Address()");
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		State = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + "]";
	}

	
}
