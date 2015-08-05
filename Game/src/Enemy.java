import java.util.Scanner;

public class Enemy {

	public String name;
	public int health, strength, posX, posY;
	
	public Enemy(){
		health = 50;
		strength = 5;
		posX = 0;
		posY = 0;
		name = "Enemy";
	}
	
	public boolean isAlive(){
		return health > 0;
	}
	
	public boolean fight(Player p1){
		System.out.println("You are fighting " + name + "!");
		Scanner input = new Scanner(System.in);
		String choice;
		
		while(isAlive() && p1.isAlive()){
			System.out.println("Do you want to punch or huggle?");
			// let's keep the fight going
			
			// Attack phase for player
			choice = input.nextLine();
			if(choice.equalsIgnoreCase("punch")){
				health -= p1.strength;
				System.out.println("You dealt " + p1.strength + " damage");
			}else if(choice.equalsIgnoreCase("huggle")){
				health -= p1.strength + 6;
				System.out.println("You dealt " + (p1.strength + 6) + " damage");
			}
			
			System.out.println("Enemy now has " + health + " health");
			
			// End of attack phase 
			
			// Enemy attack phase
			if(isAlive()){
				p1.health -= this.strength;
				System.out.println("Enemy dealt you " + this.strength + " damage");
				System.out.println("You now have " + p1.health + " health");
			}
		}
		
		if(p1.isAlive()){
			System.out.println("You won!");
			return true;
		}else{
			System.out.println("You lost! ;D");
			return false;
		}
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player("Starfish");
		Enemy e1 = new Enemy();
		e1.name = "KitKat";
		
		
		e1.fight(p1);
		
		/*
		System.out.println(e1.name);
		System.out.println(p1.isAlive());
		
		p1.health = 0;
		System.out.println(p1.isAlive());
		
		p1.health = 100;
		
		System.out.println("A roach bites you");
		p1.health -= 20;
		
		
		System.out.println("You crunch the roach with " + p1.strength + " strength");
		*/
		
	}

}

