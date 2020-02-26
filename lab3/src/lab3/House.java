package lab3;

public class House {
	private String number_rooms;
	private Address adress;
	private String area;
	private int price;
	public House(String number_rooms, Address adress, String area, int price) {
		
		this.number_rooms = number_rooms;
		this.adress = adress;
		this.area = area;
		this.price = price;
	}
	public String getNumber_rooms() {
		return number_rooms;
	}
	public void setNumber_rooms(String number_rooms) {
		this.number_rooms = number_rooms;
	}
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void display() {
		System.out.print("House : ");
		adress.display();
		System.out.println(" number of rooms: "+number_rooms+" Area: "+area+" Price: "+String.valueOf(price));
	}

}
