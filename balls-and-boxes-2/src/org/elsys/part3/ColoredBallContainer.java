package org.elsys.part3;

import java.util.Collection;

import org.elsys.part1.AbstractBallContainer;
import org.elsys.part1.Ball;
import org.elsys.part1.Color;
import org.elsys.part1.NotEnoughCapacityException;

public class ColoredBallContainer extends AbstractBallContainer {

	public Color defaultColor;
	
	public ColoredBallContainer(Color color) {
		defaultColor = color;
	}

	public Color getColor() {
		return defaultColor;
	}
	
	public boolean add(Ball b) {
		if(b != null) {
			if(b.getColor() == defaultColor)
			{
				return balls.add(b);
			} 
			
			else throw new NotEnoughCapacityException();	
		}
		return false;
	}
	
	public boolean addAll(Collection<Ball> b) {

		for(Ball b1 : b)
		{
			if(b1.getColor() == defaultColor)
			{
				balls.add(b1);
			}
			else throw new NotEnoughCapacityException();	
		}
		
		return false;
	}
}
