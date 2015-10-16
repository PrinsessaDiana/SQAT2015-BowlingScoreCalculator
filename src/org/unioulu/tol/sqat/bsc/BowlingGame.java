package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		

		
		
		
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		
		int nextRoll;
		int BonusPoint;
		
		//Bonus points for getting all pins down in two throws
		if(firstThrow == 1 && secondThrow == 9 ) {
			BonusPoint = nextRoll;
				
			
		}
			
	}
	
	public int score(){
		
		
		
		return 0;
	}
	
	public boolean isNextFrameBonus(){

        int bonusPoint;
		
		return false;
	}
}
