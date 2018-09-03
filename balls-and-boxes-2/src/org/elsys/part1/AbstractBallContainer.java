package org.elsys.part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractBallContainer {
	
	protected List<Ball> balls = new ArrayList<>();
	
	public AbstractBallContainer() {
	}

	public abstract boolean add(Ball b);
	public abstract boolean addAll(Collection<Ball> balls);

	public boolean remove(Ball b) {
		return balls.remove(b);
	}

	public double getVolume() {
		double sum = 0;
		for(Ball b : balls)
		{
			sum = sum + b.getVolume(); 
		}
		return sum;
	}

	public void clear() {
		balls.clear();
	}
	
	public boolean contains(Ball b) {
		return balls.contains(b);
	}
}
