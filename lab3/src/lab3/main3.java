package lab3;

import java.util.Scanner;

public class main3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Address abc1=new Address("kurucesme", "buca", "izmir");
		RealEstate abc=new RealEstate("ali", abc1);
		
		System.out.println("1-Add house");
		System.out.println("2-Display Allhouses");
		System.out.println("3-Search by price");
		System.out.println("4-Exit");
		int choice=sc.nextInt();
		while(choice!=4) {
			if(choice==1) {
				System.out.println("number rooms :");
				String temp_number_rooms=sc.next();
				
				
				System.out.println("Street :");
				String temp_Street=sc.next();
				System.out.println("Town: ");
				String temp_Town=sc.next();
				System.out.println("city: ");
				String temp_City=sc.next();
				Address temp_Adress=new Address(temp_Street, temp_Town, temp_City);
				System.out.println("Area: ");
				String temp_Area=sc.next();
				System.out.println("price :");
				int temp_price=sc.nextInt();
				
				House temp_house=new House(temp_number_rooms, temp_Adress,temp_Area, temp_price);
				abc.addHouse(temp_house);
			}
			else if(choice==2) {
				abc.displayAllHouses();
			}
			else if(choice==3) {
				System.out.println("Max price: ");
				int temp_max=sc.nextInt();
				System.out.println("Min price: ");
				int temp_min=sc.nextInt();
				System.out.println(temp_max);
				System.out.println(temp_min);
				abc.searchbyPrice(temp_max, temp_min);
			}
			System.out.println("1-Add house");
			System.out.println("2-Display Allhouses");
			System.out.println("3-Search by price");
			System.out.println("4-Exit");
			choice=sc.nextInt();
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}


