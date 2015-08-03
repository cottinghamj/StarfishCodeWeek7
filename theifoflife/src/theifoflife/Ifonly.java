/*
 * Coded by Starfish
 */

package theifoflife;

import java.util.Scanner;

public class Ifonly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your age?");
		int age = input.nextInt(); // Takes whatever the user inputs and stores
		if(age > 120){
			System.out.println("Is that osteoporosis kickin in yet?");
		}else if(age > 40 && age <= 120){
			System.out.println("Congrats on using a computer! XD");
		}else if(age >= 18 && age <= 40){
			System.out.println("You can see whatever movie you want!");
		}else if(age >= 13 && age < 18){
			System.out.println("You can watch a few movies. ;)");
		}else{
			System.out.println("Lolz, you can't watch whatever you want :D");
		}
		
		
		
		
		
		
		
	}

}
