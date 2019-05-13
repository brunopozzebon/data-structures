package Lists;

import Exceptions.EmptyArrayException;
import Exceptions.FullArrayException;
import Nodes.SimpleLinearNode;

public class LinkedList<E> implements List<E> {
	
	private SimpleLinearNode<E> first;
	private SimpleLinearNode<E> last;
	private int quantity;
	
	public LinkedList() {
		first=null;
		last=null;
		quantity=0;
	}
	
	public LinkedList(SimpleLinearNode<E> node) {
		first=node;
		last=node;
	}

	@Override
	public boolean isEmpty() {
		return first==null?true:false;
	}

	@Override
	public boolean isFull() {
		//It will never be full, because the array grow dynamically
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E get(int index){
		if(index>quantity || index<0) 
			throw new IndexOutOfBoundsException();
		if(index==0) 
			return getFirst();
		if(index==quantity) 
			return getFirst();
	}
	
	public E getFirst(){
		if(first==null) {
			throw new NullPointerException();
		}
		return first.getElement();
	}
	
	public E getLast() {
		if(last==null) {
			throw new NullPointerException();
		}
		return last.getElement();
	}

	@Override
	public boolean add(E element) throws FullArrayException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(E element, int index) throws FullArrayException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove(int index) throws EmptyArrayException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(E element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

}
