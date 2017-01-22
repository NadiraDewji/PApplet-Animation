/**
 *  * Nadira Azim Dewji
 * Intro to computer science
 */

import processing.core.PApplet;
public class CarAnimation extends PApplet {
	int faceX = 125, faceY = 125, faceSize = 150;
	int squareX = 0, squareY = 0, squareSize = 70;
	int shift = 0;
	int laneShift=0;
	public void setup(){
		size(400,400);
		noStroke();
		squareX = width/2;
		squareY = height/2;

	}
	/**
	 * This method does not return anything, instead it repeats and draws the shapes that are called.
	 * The draw mountain, triangle and rectanlge which correspond to the trees and the mountain have a specific shift and
	 * this shift changes by 1. Once it reaches 400, the shift is reset to -400, so that it can start over again!
	 * It starts before the frame so you cannot see the abrupt change.
	 */
	public void draw(){
		background(0,191,255);
		drawMountain(shift);
		fill(124,252,0);
		triangle(0+shift,(squareY/2)+100,squareX/2+shift,(squareY/2)+100,squareX/4+shift,100);
		fill(139, 69, 19);
		rect((2*squareX/11)+shift, squareY, squareSize/2, squareSize);	
		fill(124,252,0);
		triangle(100+shift,(squareY/2)+100,(squareX/2)+100+shift,(squareY/2)+100,(squareX/4)+100+shift,100);
		fill(139, 69, 19);
		rect((2*squareX/11)+100+shift, squareY, squareSize/2, squareSize);
		if (shift>400){
			shift =-400;
		}
		else{
			shift=shift+1;
		}
		if (laneShift>400){
			laneShift =0;
		}
		else{
			laneShift=laneShift+2;
		}

		drawGrass();

		drawLane(laneShift);
		drawCar();
	}
	/**
	 * returns nothing but the green rectangle that represents the grass.
	 */
	public void drawGrass(){
		fill(0,255,127);
		rect(0,350,400, squareSize);
		
	}
	/**
	 * returns nothing but the green rectangle that represents the lane
	 * @param lane shift though is the shift for each of the tiny yellow rectangles that keep moving.
	 * they are moving at a faster rate that the trees because the car is going really fast.
	 */
	public void drawLane(int j){
		fill(112,128,144);
		rect(0,(height/2)+squareSize,400, squareSize+10);
		for(int i=-400; i <400; i+=20){
			fill(255,255,0);
			rect(i+j,(height/2)+squareSize+20,10, 5);

		}
	}
	/**
	 * draws a mountain doesnt return anything
	 * @param i takes in the shift you want to increment so that it is animated.
	 */
	public void drawMountain(int i){
			fill(192,192,192);
			triangle(i,height,width+i,height,height/2+i,0);
		}

	public void drawTree(){
		
	}
	/**
	 * does not take any parameters nor does it return anything instead it draws out the car.
	 */
	public void drawCar(){
		//Draw car rectangle
		//make the top of the car
		fill(255,255,0);
		rect(200, (height/2)+20, 60, 30);
		//make the bottom of the car
		fill(255,255,0);
		rect(190, (height/2)+40, 80, 30);
		//make the little window
		fill(112,128,144);
		rect(205, (height/2)+25, 20,20);
		//make the wheels
		fill(0,0,0);
		ellipse(210, (height/2)+70, 20, 20);
		ellipse(250, (height/2)+70, 20, 20);


	}

}
