package Loops;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of fibonacci : ");
		
		int num =s.nextInt();
		
		int fi1=1;
		System.out.println(0);
		int fi2=1;
		int i=2;
		System.out.println(fi1 + " ");
		do{
			
			System.out.println(fi2 + " ");
			fi2 = fi1 + fi2;
            fi1 = fi2 - fi1;
			i++;
		}while(i<=num);
	}
}
