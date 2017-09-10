package snake;

import java.util.LinkedList;

public class Snake {
	private int headX;
	private int headY;
	private int headXSpeed;
	private int headYSpeed;
	private int scl;
	
	// use linked list represents the body of the snake
	// since we need to operates on both ends and also access to the elements in the middle
	private LinkedList<Block> body;
	
	public Snake(int scl) {
		headX = 0;
		headY = 0;
		headXSpeed = 1;
		headYSpeed = 0;
		this.scl = scl;
		body = new LinkedList<>();
	}
	
	public void updateLocation() {
		// update head location
		headX += headXSpeed * scl;
		headY += headYSpeed * scl;
		
		// keep headx in the range [0, windowWidth - scl]
		// keep heady in the range [0, windowHeight - scl]
	}
	
	private void updateSnake() {
		// update the body length if needed
		// snake head is the peekFirst()
		// when snake moves without eat: offerFirst() with new head
		//								 pollLast() for not needed block
		// when snake eats a food: keep everything in list, offerFirst() with the food location
	}
	
	public void updateSpeed(int addOn) {
		// update the snakes speed
	}
	
	public Block getHeadLocation() {
		// return head location as a block
		return new Block(this.headX, this.headY);
	}
	
	public void show() {
		// set snake color
		// draw a rectangle with this.x, this.y, and scl, scl
	}
}
