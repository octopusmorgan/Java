package Loops;

import java.util.Scanner;

public class NameLenght {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Escribe una cadena de texto : ");
		String cadena = s.nextLine();
		
		for(int x = 0;x<=cadena.length()-1;x++) {
			
			System.out.println(cadena.charAt(x) + " " + (x+1));
		}
		
		System.out.println("Challenge");
		for(int x =15; x<=30;x+=3) {
			System.out.println(x);
		}
		
		
	}
}
