package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;

//Finished at 13:41


import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	int BonusPoint;
	boolean spare;
	boolean strike;
	private int Score;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		
		
		Frame frame1 = null,
			  frame2 = null,
			  frame3 = null,
			  frame4 = null,
			  frame5 = null,
			  frame6 = null,
			  frame7 = null,
			  frame8 = null,
			  frame9 = null,
			  frame10 = null;
		
		frames.add(frame1);
		frames.add(frame2);
		frames.add(frame3);
		frames.add(frame4);
		frames.add(frame5);
		frames.add(frame6);
		frames.add(frame7);
		frames.add(frame8);
		frames.add(frame9);
		frames.add(frame10);
    
    
     	
     	
		
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		
		int nextRoll = 0;
		int secondNextRoll = 0;
		
		
		//Bonus points for getting all pins down in two throws (AKA Spare)
		if((firstThrow == 0 && secondThrow == 10) ||
				(firstThrow == 1 && secondThrow == 9) ||
				(firstThrow == 2 && secondThrow == 8) ||
				(firstThrow == 3 && secondThrow == 7) ||
				(firstThrow == 4 && secondThrow == 6) ||
				(firstThrow == 5 && secondThrow == 5) ||
				(firstThrow == 6 && secondThrow == 4) ||
				(firstThrow == 7 && secondThrow == 3) ||
				(firstThrow == 8 && secondThrow == 2) ||
				(firstThrow == 9 && secondThrow == 1) ) {
		
			//Bonus point is the score of next roll
			this.BonusPoint = nextRoll;
			this.spare = true;	
			
		}
			//Bonus points 
			else if(firstThrow == 10){
				
				this.BonusPoint = nextRoll + secondNextRoll;
				this.strike = true;
					
		}
			
	}
	
	public int score() { 
		
		if(Score > 0) {
			
			return Score;
		}
		
		
		return 0;
	}
	
	public void setScore(int firstThrow, int secondThrow) {
		
         Frame fr = new Frame(firstThrow, firstThrow);
		
		this.Score = fr.score();
		
		
		
	}
	
	
	
	public boolean isNextFrameBonus(){

        if(spare || strike == true) {
        	
        	return true;
        }
        else {
		
		return false; }
	}
}
