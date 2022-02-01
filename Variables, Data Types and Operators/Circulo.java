import java.util.Scanner;

public class Circulo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Area y Perimetro del circulo");
		System.out.println("Ingresa el valor del diametro (solo numeros enteros)");
		int diametro =s.nextInt();
		double diametroD = (int)diametro;
		double radio = diametroD/2;
		
		double area = 3.1416 * (radio*radio);
		double perimetro = 2*3.1416*radio;
		
		System.out.println("Area : " + area);
		System.out.println("Perimetro : " + perimetro);
	}
}