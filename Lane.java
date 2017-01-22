import processing.core.PApplet;
/**
 * 
 * @author NadiraDewji
 *
 */
public class Lane extends Shape{
	Lane(PApplet _p){
		 super(_p);
	}
	/**
	 * this override method exists because the lane should move twice as fast as the other objects in order to make the animaiton look better.
	 */
@Override
	public void move(){
		this.shift = this.shift + 2;
		if (shift>400){
			shift =0;
		}
		else{
			shift=shift+2;
		}
	}
/**
 * draws the actual car and lane.
 */
	public void render(){
		getP().fill(112,128,144);
		getP().rect(0,(getP().height/2)+squareSize,400, squareSize+10);
		getP().fill(0,255,127);
		getP().rect(0,350,400, squareSize);
		getP().fill(255,255,0);
		getP().rect(200, (getP().height/2)+20, 60, 30);
		//make the bottom of the car
		getP().fill(255,255,0);
		getP().rect(190, (getP().height/2)+40, 80, 30);
		//make the little window
		getP().fill(112,128,144);
		getP().rect(205, (getP().height/2)+25, 20,20);
		//make the wheels
		getP().fill(0,0,0);
		getP().ellipse(210, (getP().height/2)+70, 20, 20);
		getP().ellipse(250, (getP().height/2)+70, 20, 20);
		for(int i=-400; i <400; i+=20){
			getP().fill(255,255,0);
			getP().rect(i+shift,(getP().height/2)+squareSize+20,10, 5);

		}
	}
}
