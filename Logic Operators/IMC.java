import java.util.Scanner;
public class IMC {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Indice de Masa Corporal");
		
		
		System.out.println("Ingresa tu peso en kg.");
		double peso =s.nextDouble();
		
		System.out.println("Ingresa tu altura en m.");
		double altura =s.nextDouble();
		
		double imc = peso/Math.pow(altura, 2);
		
		if(imc<18.5) {
			System.out.println("Peso inferior al normal	");
		}
		else if(imc >= 18.5 && imc <=24.9) {
			System.out.println("Normal");
		}
		else if(imc >= 25.5 && imc <=29.9) {
			System.out.println("Peso superior al normal");
		}
		else {
			System.out.println("Obesidad");
		}
	
		
	}
}
