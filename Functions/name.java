import java.util.Scanner;
public class name {
	public static void main(String[] args) {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.next();
        
        System.out.println( "Enter your Last Name:  " );
        String lastName = console.next();
        
        printNameCharacters( "Alonso" );
        printNameLength( "Alonso" );
        printNameCharacters( "Luis" );
        printNameLength( "Luis" );
        printNameCharacters( "Maria" );
        printNameLength( "Maria" );
        printNameCharacters( "Fernanda" );
        printNameLength("Fernanda" );
        printNameCharacters( "Julio" );
        printNameLength( "Julio" );
        
        
       printNameCharacters( name );
       printNameLength( name );
       
       printLastName(name, lastName);
       console.close();
	}
	private static void printNameLength( String name )
    {
        //TODO implement this code
		int length = name.length();
		System.out.println("The length of your name is : " + length);
		
    }

    private static void printNameCharacters( String name )
    {
        //TODO implement this code
    	for(int i=0;i<name.length();i++) {
    		System.out.println(name.charAt(i));
    		
    	}
    }
    
    private static void printLastName(String name,String lastName) {
    	System.out.println(name+ " " + lastName);
    	
    }

}
