package org.elsys.part1;

import java.util.Collection;

public class BallContainer extends AbstractBallContainer {

	public boolean add(Ball b) {
		if(b != null) {
				return balls.add(b);		
		}
		return false;
	}

	public boolean addAll(Collection<Ball> balls) {
		return balls.addAll(balls);
	}

}