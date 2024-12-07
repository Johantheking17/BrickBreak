import java.awt.*;

public class Paddle {

	//your code here!
//
//  Class author:  John Taylor
//  Date created:  12/5/24
//  General description: This create the paddle the user controls, moving side to side.
//


	
	//don't forget you need instance variables:
	private int xpos;
	private int ypos;
	private int width;
	private int height;
	private int velocity;
	
	//constructor(s):
	Paddle(int xpos, int ypos, int width, int height){
		this.xpos = xpos;
		this.ypos = ypos;
		this.width = width;
		this.height = height;
		velocity = 0;
	}
	//methods:
	public int getX(){
		return xpos;
	}

	public int getY(){
		return ypos;
	}

	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}

	public int getVelocity(){
		return velocity;
	}

	public void setX(int newX){
		xpos = newX;
	}

	public void setVelocity(int newVelocity){
		velocity = newVelocity;
	}

	//
//  Pre-condition: the extravelocity is an integer
//  Post-condition: the velocity increases given whats inn the argument
//
	public void addVelocity(int extraVelocity){
		velocity += extraVelocity;
	}

	//
//  Pre-condition: nothing
//  Post-condition: the paddle moves an increment to the side according to the given velocity
//
	public void move(){
		xpos += velocity;
	}

	//
//  Pre-condition: g is an instance of Graphics
//  Post-condition: the paddle si created on the screen
//
	public void draw(Graphics g){
		g.setColor(Color.white);
		g.fillRect(xpos, ypos, width, height);
	}
	
	
	
	
}
