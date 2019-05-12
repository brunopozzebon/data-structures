package Lists;

import Exceptions.FullListException;

public class ArrayList<E> implements List<E> {

	
	private E[] elements;
	private int pointer;
	
	public ArrayList() {
		elements = (E[]) new Object[10];
		pointer=0;
	}
	
	
	@Override
	public boolean isEmpty() {
		return pointer==0?true:false;
	}

	@Override
	public boolean isFull() {
		//It isn´t full, because the array grow dynamically
		return false;
	}

	@Override
	public int size() {
		return pointer;
	}

	@Override
	public E get(int index) {
		if(index>=pointer || index<0) {
			throw new IndexOutOfBoundsException();
		}
		return elements[index];
	}

	@Override
	public boolean add(E element) throws FullListException {
		return add(element,pointer);
	}

	@Override
	public boolean add(E element, int index) throws FullListException {
		if(element==null) {
			throw new NullPointerException();
		}
		if(pointer==elements.length) {
			increaseTheSize(pointer);
		}
		
		if(index>pointer || index<0) {
			throw new IndexOutOfBoundsException();
		}
		
		for (int i = pointer; i > index; i--) {
			elements[i]=elements[i-1];
		}
		elements[index]=element;
		pointer++;
		return true;
	}

	private void increaseTheSize(int pointer2) {
		E[] oldElements = elements;
		elements = (E[]) new Object[pointer*2];
		for (int i = 0; i < oldElements.length; i++) {
			elements[i]=oldElements[i];
		}
	}


	@Override
	public E remove(int index) {
		if(index>=pointer || index<0) {
			throw new IndexOutOfBoundsException();
		}
		E element = elements[index];
		for (int i = index; i < pointer-1; i++) {
			elements[i]=elements[i+1];
		}
		pointer--;
		elements[pointer]=null;
		return element;
	}

	@Override
	public boolean contains(E element) {
		if(element==null) {
			return false;
		}
		for (int i = 0; i < pointer; i++) {
			if(elements[i].equals(element)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void print() {
		for (int i = 0; i < pointer; i++) {
			System.out.println("Element "+i+" = ["+elements[i]+"]");
		}	
	}

}
