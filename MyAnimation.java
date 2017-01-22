
import processing.core.PApplet;
import java.util.ArrayList;
import java.util.Random;
/**
 * 
 * @author NadiraDewji
 *  Intro to Computer Science
 */
public class MyAnimation extends PApplet {
	Random rng = new Random();
	int MountainColor;
	int x;
	/**
	 * these array lists are used to store every instance of the mountains and trees.
	 */
	ArrayList <Tree> myTrees = new ArrayList<Tree>();
	ArrayList <Mountain> myMountains = new ArrayList<Mountain>();
	Tree myTree;
	Mountain myMountain;
	Lane myLane;
	/**
	 * set up here is used to initialize and declare the initial objects.
	 */
	public void setup(){
		size(400,400);
		noStroke();
		myTree = new Tree(this, 200);
		myMountain = new Mountain(this,200);
		myLane = new Lane(this);
		x = rng.nextInt(width);	
	}
	/**
	 * since draw is called repeatedly, a new instance for every object will be created will be looped from the array to be printed..
	 */
	public void draw() {
		background(0,191,255);
		for(Mountain myMountain: myMountains){
			myMountain.move();
			myMountain.render();
		}
		for(Tree myTree: myTrees){
			myTree.move();
			myTree.render();	
		}

		myLane.move();
		myLane.render();
		
	}
	/**
	 * when the letter t is pressed a random number is generated that determines the random x coordinate of the object.
	 */
	public void keyPressed() {
		if (key == 't'){
			x = rng.nextInt(width);
			Tree newTree = new Tree(this, x);
			myTrees.add(newTree);
			
			
		}
		if (key == 'm'){
			x = rng.nextInt(width);
			Mountain newMountain = new Mountain(this, x);
			myMountains.add(newMountain);
		}
		
	}

	

}
