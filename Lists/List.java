package Lists;

import Exceptions.FullListException;

public interface List<E> {
	public boolean isEmpty();
	public boolean isFull();
	public int size(); //NumOfElements
	public E get(int index);
	public boolean add(E element) throws FullListException;
	public boolean add(E element,int index) throws FullListException;
	public E remove(int index);
	public boolean contains(E element);
	public void print();
}
