package Lists;

import Exceptions.EmptyArrayException;
import Exceptions.FullArrayException;

public class StaticList<E> implements List<E> {
	private E[] elements;
	private int pointer;
	public StaticList(int size) {
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
	public E get(int index) {
		if(index>=pointer || index<0) 
			throw new IndexOutOfBoundsException();
		return elements[index];
	}

	@Override
	public boolean add(E element) throws FullArrayException {
		if(element==null) 
			throw new NullPointerException();
		if(pointer==elements.length) 
			throw new FullArrayException("This list is full");

		elements[pointer]=element;
		pointer++;
		return true;
	}

	@Override
	public boolean add(E element, int index) throws FullArrayException{
		if(element==null) 
			throw new NullPointerException();
		
		if(pointer==elements.length) 
			throw new FullArrayException("This list is full");

		if(index>pointer || index<0) 
			throw new IndexOutOfBoundsException();

		for (int i = pointer; i > index; i--) 
			elements[i]=elements[i-1];
			
		elements[index]=element;
		pointer++;
		return true;
	}

	@Override
	public E remove(int index) throws EmptyArrayException {
		if(isEmpty())
			throw new EmptyArrayException("The list is empty");
		
		if(index>=pointer || index<0) 
			throw new IndexOutOfBoundsException();
		
		E element = elements[index];
		for (int i = index; i < pointer-1; i++) 
			elements[i]=elements[i+1];
		pointer--;
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
