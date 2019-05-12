package Exceptions;

public class EmptyArrayException extends Exception {
	String message;
	public EmptyArrayException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "EmptyArrayException [" + message + "]";
	}
}
