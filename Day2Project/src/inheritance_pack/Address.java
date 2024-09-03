package inheritance_pack;

public final class Address {
	private int doorNo;
	private String street;
	private String locality;
	private String city;
	private String state;
	private long pincode;
	
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", locality=" + locality + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	public Address() {}
	
	public Address(int doorNo, String street, String locality, String city, String state, long pincode) {
		this.doorNo = doorNo;
		this.street = street;
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	
}
