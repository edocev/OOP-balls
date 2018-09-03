package org.elsys.part1;

public class NotEnoughCapacityException extends RuntimeException {
	public String message;
	
	public NotEnoughCapacityException() {
		message = "kyr";
	}

	public String getMessage() {
		return message;
	}
}
