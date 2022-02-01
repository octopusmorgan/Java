package ControlFLow;

import java.util.Scanner;

public class MovieDiscounts {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = s.nextInt();
		double price = 7;
		double discount;
		if(age>=5 && age<=60) {
			System.out.println("How many tickets you want?");
			int ticket =s.nextInt();
			if(ticket >=2)
			{
				discount = price*.30;
				System.out.println(ticket +  " Ticket Price " + ticket*price + " 20% Discount Total : " + ((price*ticket)-discount) + " euros");
			}
			else {
				System.out.println("Normal Ticket Price : " + price + " euros");
			}
		}
		else if(age<5&&age>=0) {
			discount = price*.60;
			System.out.println("60% Discount Price :" + discount + " Total : " + (price-discount) + " euros");
		}
		else if(age>60) {
			discount = price*.55;
			System.out.println("55% Discount" + discount + " Total : " + (price-discount) + " euros");
		}
	}
}
