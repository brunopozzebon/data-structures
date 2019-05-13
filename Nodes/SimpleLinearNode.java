package Nodes;

public class SimpleLinearNode<E> {
	private E element;
	private SimpleLinearNode<E> nextNode;
	
	public SimpleLinearNode(E element, SimpleLinearNode<E> nextNode) {
		this.element = element;
		this.nextNode = nextNode;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public SimpleLinearNode<E> getNextNode() {
		return nextNode;
	}

	public void setNextNode(SimpleLinearNode<E> nextNode) {
		this.nextNode = nextNode;
	}
}
