package Exceptions;

public class FullArrayException extends Exception{
	String message;
	public FullArrayException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "FullArrayException [" + message + "]";
	}
}
