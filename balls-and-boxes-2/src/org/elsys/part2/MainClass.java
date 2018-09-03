package org.elsys.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.elsys.part1.Ball;
import org.elsys.part1.BallContainer;
import org.elsys.part1.Box;
import org.elsys.part1.Color;
import org.elsys.part1.NotEnoughCapacityException;

import java.util.Scanner;

public class MainClass {
	public void main(String[] args) {
		
		 List<Integer> inputNumbers = new ArrayList<Integer>();
		 
		 Scanner sc = new Scanner(System.in);

	        while (sc.hasNext()) {
	            Arrays.stream(sc.nextLine().split(", "))
	                  .forEach(token -> inputNumbers.add(Integer.parseInt(token)));
	        }

	     sc.close();
	        
	     List<Ball> balls = new ArrayList<Ball>();

	        for (Integer number : inputNumbers) {
	            switch (number % 4) {
	                case 0:
	                    balls.add(new Ball(1.0, Color.WHITE));
	                    break;
	                case 1:
	                    balls.add(new Ball(1.0, Color.GREEN));
	                    break;
	                case 2:
	                    balls.add(new Ball(1.0, Color.BLUE));
	                    break;
	                case 3:
	                    balls.add(new Ball(1.0, Color.RED));
	                    break;
	            }
	        }

	        BallContainer ballContainer = new BallContainer();

	        ballContainer.addAll(balls);

	        try {

	        	Box box = new Box(50);
	        	
	        	Iterator<Ball> ballsFromSmallestIterator = box.getBallsFromSmallest();

	            Box sortedBox = new Box(50);

	            while (ballsFromSmallestIterator.hasNext()) {
	                sortedBox.add(ballsFromSmallestIterator.next());
			}
	        } catch (NotEnoughCapacityException ex) {
	            System.out.println(ex.getMessage());
	        }
	    }
}
