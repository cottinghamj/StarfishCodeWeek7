
public class Loops {

	public static void main(String[] args) {
		int apples = 100;
		// while loop will keep executing this code until the condition in parentheses is met
		while(apples > 0){
			
			apples = apples - 1;
			if(apples == 99)
				System.out.println("You have eaten " + (100 - apples) + " apple so far");
			else if(apples <= 90){
				System.out.println("You have eaten " + (100 - apples) + " apples so far :^(");
			}else
				System.out.println("You have eaten " + (100 - apples) + " apples so far" );
			
			if(apples == 50)
				System.out.println("You are turning red.");
			if(apples == 25)
				System.out.println("You develop a stem");
			
		}
		System.out.println("Decent job. You are now an apple!");
	}
	
}

