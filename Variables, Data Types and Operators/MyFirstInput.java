import java.util.Scanner;

public class MyFirstInput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your name ");
		String name = s.nextLine();
		System.out.println("My name is "+ name);
	}
}
