package org.elsys.part1;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.elsys.part1.Ball;
import org.elsys.part3.ColoredBallContainer;
import org.junit.Test;

public class ColoredBallContainerTest {

	@Test
	public void testAddTrue() {
		ColoredBallContainer clCnt = new ColoredBallContainer(Color.WHITE);
		assertTrue(clCnt.add(new Ball(5)));
		assertTrue(clCnt.add(new Ball(5)));
	}
	
	@Test(expected = NotEnoughCapacityException.class)
	public void testAddFalse() {
		ColoredBallContainer clCnt = new ColoredBallContainer(Color.WHITE);
		assertTrue(clCnt.add(new Ball(5)));
		clCnt.add(new Ball(6, Color.BLACK));
	}

	@Test(expected = NotEnoughCapacityException.class)
	public void testAddAll() {
		ColoredBallContainer clCnt = new ColoredBallContainer(Color.WHITE);
		clCnt.addAll(Arrays.asList(new Ball(1), new Ball(10, Color.BLACK)));
	}

	@Test
	public void testNull() {
		ColoredBallContainer clCnt = new ColoredBallContainer(Color.WHITE);
		assertFalse(clCnt.add(null));
	}

}
