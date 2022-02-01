import java.util.Scanner;
public class UserProfile {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner i = new Scanner(System.in);
		System.out.println("Cual es tu nombre ? ");
		String name = s.nextLine();

		System.out.println("Cual es tu edad ? ");
		int edad = i.nextInt();

		System.out.println("Cual es tu genero ? ");
		String genero = s.nextLine();
		
		System.out.println("Cual es tu preferencia de trabajo  ? ");
		String job = s.nextLine();
		
		String nacionalidad = "Mx";
		
		System.out.println("Cual es tu tipo de sangre ? ");
		String sangre = s.nextLine();
		
		System.out.println("Nombre : " + name + "\nEdad : "+ edad + "\nGenero : " + genero + "\nTrabajo de Preferencia :  " + "\nNacionalidad : " + nacionalidad + "\nTipo de Sangre : " + sangre);

		int año = 2022;
		año = (2022- edad);
		System.out.println("Tu año de nacimiento es : " + año + " o " + (año-1));
	}
}