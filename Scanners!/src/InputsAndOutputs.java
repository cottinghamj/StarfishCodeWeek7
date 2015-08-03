import java.util.Scanner;
public class InputsAndOutputs {

	public static void main(String[] args) { // need this methods to execute any code
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in); // instantiate a scanner object. Kinda like buying a scanner from the store
		
		System.out.println("What's your name?"); // Ask the user for their name
		
		String name = myScanner.nextLine(); // Store the user's response in a variable we can use later. Must be a String since that's what .nextLine() returns
		
		System.out.println("Hi! Your name is " + name); // string concatenation
	
		
	}
	
}
