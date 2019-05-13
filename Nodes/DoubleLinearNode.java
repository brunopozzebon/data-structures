package Nodes;

public class DoubleLinearNode<E> {
	private E element;
	private DoubleLinearNode<E> nextNode;
	private DoubleLinearNode<E> previousNode;
	
	public DoubleLinearNode(E element,DoubleLinearNode<E> previousNode, DoubleLinearNode<E> nextNode) {
		this.element = element;
		this.previousNode = previousNode;
		this.nextNode = nextNode;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public DoubleLinearNode<E> getNextNode() {
		return nextNode;
	}

	public void setNextNode(DoubleLinearNode<E> nextNode) {
		this.nextNode = nextNode;
	}

	public DoubleLinearNode<E> getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(DoubleLinearNode<E> previousNode) {
		this.previousNode = previousNode;
	}
	
	
}
