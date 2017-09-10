package snake;

public class Food {
	private int x;
	private int y;
	
	public Food(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void update() {
		// set new random food location
	}
	
	public Block getFoodLocation() {
		// return food location as block
		return new Block(this.x, this.y);
	}
}
