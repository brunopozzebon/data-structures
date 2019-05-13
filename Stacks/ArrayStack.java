package Stacks;

import Exceptions.EmptyArrayException;
import Exceptions.FullArrayException;

public class ArrayStack<E> implements Stack<E> {
	private E[] elements;
	private int pointer;
	
	//The Array begin with 10 spaces, and it will grow if it will be necessary
	
	public ArrayStack() {
		elements = (E[]) new Object[10];
		pointer=0;
	}
	
	@Override
	public boolean isEmpty() {
		return pointer==0?true:false;
	}

	@Override
	public boolean isFull() {
		//It will never be full, because the array grow dynamically
		return false;
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
	public void push(E element) throws FullArrayException {
		if(pointer==elements.length) 
			increaseSize();
		elements[pointer]=element;
		pointer++;
	}

	//This method increase the array, creating a new array with double size, and realocating the elements
	
	private void increaseSize() {
		E[] oldElements = elements;
		elements = (E[]) new Object[pointer*2];
		for (int i = 0; i < oldElements.length; i++) 
			elements[i]=oldElements[i];		
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
