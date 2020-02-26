package lab3;

public class RealEstate {
private String Agent_name;
private Address agent_Adress;
private House[] house_list=new House[150];
private static int k=0;
public RealEstate(String agent_name, Address agent_Adress) {
	super();
	Agent_name = agent_name;
	this.agent_Adress = agent_Adress;
}
public String getAgent_name() {
	return Agent_name;
}
public void setAgent_name(String agent_name) {
	Agent_name = agent_name;
}
public Address getAgent_Adress() {
	return agent_Adress;
}
public void setAgent_Adress(Address agent_Adress) {
	this.agent_Adress = agent_Adress;
}
public void addHouse(House h) {
	house_list[k]=h;
	k++;
}
public void displayAllHouses() {
	for (int i = 0; i < k; i++) {
		house_list[i].display();
	}
}

public int getNumHouses() {
	return k;
}
public void searchbyPrice(int a,int b) {
	for (int i = 0; i < k; i++) {
		if(house_list[i].getPrice()<a&&house_list[i].getPrice()>b) {
			house_list[i].display();
		}
		
	}
	
}

}
