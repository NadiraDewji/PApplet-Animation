/**
 * Intro to Computer Science
 * @author NadiraDewji
 *
 */
public class Ball {
	int x;
	int y;
	int vx;
	int vy;
	int boardWidth;
	int boardHeight;
	int diameter;
	/**
	 * Ball constructor that sets the x,y, vx and vy according to what has been put in.
	 * @param x
	 * @param y
	 * @param vx
	 * @param vy
	 * @param boardWidth
	 * @param boardHeight
	 * @param diameter
	 */
	public Ball(int x, int y, int vx, int vy, int boardWidth, int boardHeight, int diameter){
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
		this.boardWidth= boardWidth;
		this.boardHeight= boardHeight;
		this.diameter=diameter;
	}
	
	/**
	 * the move method increments the x by specific frames that are contingent on the x value.
	 * it also increments the y coordinate by the y.
	 * If the x goes beyond the frame it goes back and bounces
	 * If the y goes beyond the frame it goes above it bounces back but below you leave it there.
	 * 
	 */
	public void move(){
		int r = diameter;
		this.x = vx+x;
		this.y = vy+y;
		
		if(x < 0+r) {
			this.x = r;
			this.vx *= -1;
		}
		else if (x > boardWidth - r) {
			this.x = boardWidth - r;
			this.vx *= -1;
		}
		
		if(y < r) {
			this.y = r;
			this.vy *= -1;
		}
		
		if(y >=boardHeight+20){
			this.vy=0;
			this.vx =0;
			this.y = vy+y;
		}
		
		/*
		if(x==(0+diameter/2)){
			this.x= diameter/2;
			this.vx = Math.abs(vx) ;

		}
		else if(x==380){
			this.x= 380;
			this.vx = Math.abs(vx) *-1;


		}
		if(y==diameter/2){
			this.y=diameter/2;
			this.vy = vy*-1;

		}
		if(y>420){
			this.vy=0;

		}
		*/
	}

}
