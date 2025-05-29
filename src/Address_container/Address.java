package Address_container;

public class Address {
	private String city;
	private String dist;
	private String state;
	private int pincode;
	
	public Address(String city, String dist, String state, int pincode) {
		this.city = city;
		this.dist = dist;
		this.state = state;
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	

}
