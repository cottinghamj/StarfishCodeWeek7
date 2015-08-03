import java.util.Scanner;
public class AddingUpFromInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int firstNum = scnr.nextInt(); // We use nextInt to take in numbers
		int secondNum = scnr.nextInt();
		
		System.out.println("Sum is " + (firstNum + secondNum));
	}

}
