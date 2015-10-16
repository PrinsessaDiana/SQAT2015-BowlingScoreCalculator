package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	@Test
	public void test() {
		
		int throwOne = 1;
		int throwTwo = 6;
		
		
		Frame testiframe = new Frame(throwOne, throwTwo);
		
		
		assertEquals(7, testiframe.score() );
		
			
			
		}
		
		
		
		
		
		
//		BowlingGame bg = new BowlingGame();
//		BowlingGame bg2 = new BowlingGame();
//		BowlingGame bg3 = new BowlingGame();
//		BowlingGame bg4 = new BowlingGame();
//		
//		bg.setBonus(1, 5);
//           assertEquals(false, bg.isNextFrameBonus() );
//        bg2.setBonus(2, 8);
//         assertEquals(true, bg2.isNextFrameBonus() );
//        bg3.setBonus(10, 0);
//           assertEquals(true, bg3.isNextFrameBonus() );
//        bg4.setBonus(0, 10);
//           assertEquals(true, bg4.isNextFrameBonus() );
		
		
		
		
	}


