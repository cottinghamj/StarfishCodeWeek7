package graphics;

import processing.core.PApplet;
import processing.core.PImage;


public class Graphics extends PApplet {

	PImage pic;
	Player p1;
	boolean movingRight, movingLeft;
	
	public void setup() {
		size(700, 700);
		pic = loadImage("logo.png.PNG");
		p1 = new Player("Starfish");
		movingRight = false;
		movingLeft = false;
	}

	// Constantly being called
	public void draw() {
		background(5, 5, 5); // (r, g, b) -> red, green, blue each one goes form 0 - 255
		text("yo", 200, 300);
		
		image(pic, 100, 100);
		
		ellipse(p1.posX, p1.posY, 20, 20);
		
		person();
		
		move();
		
		ellipse(p1.posX, p1.posY, 20, 20);
		
	}
	
	public void keyPressed(){
		if(key == 'd'){
			movingRight = true;
		}if(key == 'a'){
			movingLeft = true;
		}
	}
	
	public void keyReleased(){
		if(key == 'd'){
			movingRight = false;
		}if(key == 'a'){
			movingLeft = false;
		}
	}
	
	public void move(){
		if(movingRight){
			p1.posX += 5;
		}if(movingLeft){
			p1.posX -= 5;
		}
	}
	
	public void person(){
		fill(255, 255, 255);
		ellipse(170, 330, 50, 50);
		ellipse(340, 330, 50, 50);
		
		fill(0, 0, 200);
		rect(220, 500, 70, 40);
		
		fill(200, 0, 0);
		triangle(100, 100, 200, 200, 24, 400); // You need 3 (x,y) positions
	}
}
