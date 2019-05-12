package Lists;

import Exceptions.EmptyArrayException;
import Exceptions.FullArrayException;

public interface List<E> {
	public boolean isEmpty();
	public boolean isFull();
	public int size(); //NumOfElements
	public E get(int index);
	public boolean add(E element) throws FullArrayException;
	public boolean add(E element,int index) throws FullArrayException;
	public E remove(int index) throws EmptyArrayException;
	public boolean contains(E element);
	public void print();
}
