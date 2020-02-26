package lab3;

public class Address {
	private String streetname;
	private String town;
	private String city;
	public Address(String streetname, String town, String city) {
		
		this.streetname = streetname;
		this.town = town;
		this.city = city;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void display() {
		System.out.print(" Adress: "+streetname+" "+town+"/"+city);
	}
	

}
