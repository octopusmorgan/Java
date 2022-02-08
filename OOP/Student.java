package poo;

public class Student {
	String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
       
       
 public Student(String firstName, String lastName, int registration, int grade, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.grade = grade;
		this.year = year;
	}

public void printFullName(){
    System.out.println(firstName+ " "+ lastName);
}

public void isApproved(){
     //TODO implement: should return true if grade >= 60
	if(grade>=60) {
		System.out.println(true);
	}
}

public int changeYearIfApproved(){
     //TODO implement: the student should advance to the next year if he/she grade is >= 60
     // Make year = year + 1, and print "Congragulations" if the student has been approved
	if (grade>=60) {
		year=year+1;
		System.out.println("Congratulations");
	}
	return 0;
}
 
 public static void main(String[] args) {
	Student student1 = new Student("Alonso","Rodriguez",1215452,70,1994);
	
	student1.printFullName();
	student1.isApproved();
	student1.changeYearIfApproved();
	
}

}


