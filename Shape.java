import java.util.Random;

import processing.core.PApplet;
import java.util.Random;
/**
 * 
 * @author NadiraDewji
 * this is the super class it is called shape and controls many of the functions of the subclasses like the move method. it has all the _p gtter.
 *it also have the initial data fields squarey and x that control the size of the screen.
 */
public class Shape {
	int shift;
	Random size = new Random();
	public Shape(PApplet _p){
		this._p = _p;
	}


	

	int squareX = 200, squareY = 200, squareSize = 70;
	private PApplet _p;
	

	public PApplet getP(){
		return this._p;
	}
	public void move(){
		this.shift = this.shift + 1;
		if (shift>400){
			shift =-700;
		}
		else{
			shift=shift+1;
		}
	}

}
