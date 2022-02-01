package ControlFLow;
import java.util.Scanner;

public class CommissionCalculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your sales : ");
		double sales = s.nextDouble();
		double discount;
		if(sales>10000) {
			discount=sales*.30;
			System.out.println("Sale : " + sales + " - 30% discount = " + (discount) + " Total : " + (sales-discount));
		}
		else if(sales>5000 && sales<=10000) {
			discount=sales*.20;
			System.out.println("Sale : " + sales + " - 20% discount = " + (discount)+ " Total : " + (sales-discount));
		}
		else if(sales>1000 && sales<=5000) {
			discount=sales*.20;
			System.out.println("Sale : " + sales + " - 10% discount = " + (discount)+ " Total : " + (sales-discount));
		}
		else {
			System.out.println("Sale : " + sales);
		}
		
	}
}
