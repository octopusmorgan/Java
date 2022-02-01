import java.util.Scanner;
public class ClassGrader {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your grade : ");
		double grade = s.nextDouble();
		
		
		if(grade>=0&&grade<=10) {
			
			if(grade<=3) {
				System.out.println("Failed");
			}
			else if (grade>3&&grade<=5) {
				System.out.println("Insufficient");
			}
			else if (grade>5&&grade<=9) {
				System.out.println("Good");
			}
			else {
				System.out.println("Excellent Grade");
			}
		}
		else {
			System.out.println("Ingresa una calificacion en el rango de  (0-10)");
		}
	}
}
