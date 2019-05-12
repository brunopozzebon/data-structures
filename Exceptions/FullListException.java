package Exceptions;

public class FullListException extends Exception{
	String message;
	public FullListException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "FullListException [" + message + "]";
	}
}
