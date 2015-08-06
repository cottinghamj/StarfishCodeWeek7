
public class DeafGrandma extends Enemy{
	
	public boolean cane;
	
	public DeafGrandma(){

		super();
		health = 30;
		strength = 50;
		posX = 0;
		posY = 0;
		name = "Deaf Grandma";
		
		// This is unique attribute to deaf grandma that enemy does not have
		cane = true;
	
	}
	
	public static void main(String args[]){
		Player p1 = new Player("Starfish");
		DeafGrandma g1 = new DeafGrandma();
		
		g1.fight(p1);
	}
	
}
