import java.awt.*;

public class Ball {
	//your code here!
//
//  Class author:  John Taylor
//  Date created:  12/5/24
//  General description: This creates a ball object that has various propeties like position, size, and speed
//




	//don't forget you need instance variables:
	private int xpos;
	private int ypos;
	private int size;
	private int xVelocity;
	private int yVelocity;
	

	//constructor(s):

	Ball(int xpos, int ypos, int size){
		this.xpos = xpos;
		this.ypos = ypos;
		this.size = size;
		xVelocity = 1;
		yVelocity = 1;
	}
	//methods:
	public int getXpos(){
		return xpos;
	}

	public int getYpos(){
		return ypos;
	}

	public int getSize(){
		return size;
	}

	public void setX(int newX){
		xpos = newX;
	}

	public void setY(int newY){
		ypos = newY;
	}

	public void setXVelocity(int newXVelocity){
		xVelocity = newXVelocity;
	}

	public void setYVelocity(int newYVelocity){
		yVelocity = newYVelocity;
	}

	//
//  Pre-condition: nothing
//  Post-condition: x velocity is reversed
//
	public void reverseX(){
		xVelocity *= -1;
	}

	//
//  Pre-condition: nothing
//  Post-condition: y velocity is reversed
//
	public void reverseY(){
		yVelocity *= -1;
	}

	//
//  Pre-condition: nothing
//  Post-condition: ball moves an increment according to the given velocities
//
	public void move(){
		xpos += xVelocity;
		ypos += yVelocity;
	}
//
//  Pre-condition: g is an instance of Graphics
//  Post-condition: this creates the ball on the screen
//

	public void draw(Graphics g){
		g.setColor(Color.red);
		g.fillOval(xpos, ypos, size, size);
	}
}
