package graphics;

public class Player {

	public String name;
	public int health, strength, posX, posY;
	
	public int specialAttacks;
	
	public Player(String n){
		health = 50;
		strength = 5;
		posX = 50;
		posY = 20;
		name = n;
		
		specialAttacks = 1;
		
	}
	
	public boolean isAlive(){
		return health > 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player("Starfish");
		System.out.println(p1.isAlive());
		
		p1.health = 0;
		System.out.println(p1.isAlive());
		
		p1.health = 100;
		
		System.out.println("A roach bites you");
		p1.health -= 20;
		
		System.out.println("You crunch the roach with " + p1.strength + " strength");
	}

}
