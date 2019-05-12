package Stacks;

import Exceptions.EmptyArrayException;
import Exceptions.FullArrayException;

public interface Stack<E> {
	public boolean isEmpty();
	public boolean isFull();
	public int size(); //NumOfElements
	public E top(); //Get the top element of the stack
	public void push(E element) throws FullArrayException; //Insert a element on the top af a stack
	public E pop() throws EmptyArrayException; //Remove the top element of the stack
	public boolean contains(E element); 
	public void print();
}
