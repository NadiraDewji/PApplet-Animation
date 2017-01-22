/**
 * Intro to Computer Science
 * @author NadiraDewji
 *
 */
public class Bar {
	int x;
	int y;
	int vx;
	int barWidth;
	int barHeight;
	int boardWidth;
	
	/**
	 * The constructor bar takes in all these parameters
	 * 
	 * @param x
	 * @param y
	 * @param vx
	 * @param barWidth
	 * @param barHeight
	 * @param boardWidth
	 */
	public Bar(int x, int y, int vx, int barWidth, int barHeight, int boardWidth){
		this.x = x;
		this.y= y;
		this.vx= vx;
		this.barWidth= barWidth;
		this.barHeight = barHeight;
		this.boardWidth = boardWidth;
		
	}
	/**
	 * The move method of the paddle is constricted vertically so velocity  for y does not change  the vvelocity for x changes.
	 */
	public void move(){
		this.x = vx+ x;
		if(x+barWidth>400){
			this.x=325;
			
		}
		else if (x<0){
			this.x=0;
		}
	}
	public void goLeft(){
		this.vx = -1*(Math.abs(vx));
	}
	public void goRight(){
		this.vx = Math.abs(vx);
	}


}
