package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;

public class TestBowlingScoreCalculator {

	@Test
	public void test() {
		
		BowlingGame bg = new BowlingGame();
		
		bg.setBonus(10, 0);
		
		assertEquals(true, bg.isNextFrameBonus() );
		
		
		
		
	}

}
