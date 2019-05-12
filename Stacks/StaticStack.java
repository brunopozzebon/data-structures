package Stacks;

import Exceptions.EmptyArrayException;
import Exceptions.FullArrayException;

public class StaticStack<E> implements Stack<E> {
	private E[] elements;
	private int pointer;
	
	public StaticStack(int size) {
		elements = (E[]) new Object[size];
		pointer=0;
	}

	@Override
	public boolean isEmpty() {
		return pointer==0?true:false;
	}

	@Override
	public boolean isFull() {
		return pointer==elements.length?true:false;
	}

	@Override
	public int size() {
		return pointer;
	}

	@Override
	public E top() {
		if(isEmpty())
			return null;
		return elements[pointer-1];
	}

	@Override
	public void push(E element) throws FullArrayException{
		if(isFull()) 
			throw new FullArrayException("The stack is full");
		elements[pointer]=element;
		pointer++;
	}

	@Override
	public E pop() throws EmptyArrayException {
		if(isEmpty()) 
			throw new EmptyArrayException("The stack is full");
		E element = elements[--pointer];
		elements[pointer]=null;
		return element;
		
	}

	@Override
	public boolean contains(E element) {
		if(element==null) 
			return false;

		for (int i = 0; i < pointer; i++) 
			if(elements[i].equals(element)) 
				return true;
		return false;
	}

	@Override
	public void print() {
		for (int i = 0; i < pointer; i++) 
			System.out.println("Element "+i+" = ["+elements[i]+"]");
	}

}
