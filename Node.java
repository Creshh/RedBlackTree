package rbtree;

public class Node<T extends Comparable<T>, S> {
	private Node<T, S> leftChild;
	private Node<T, S> rightChild;
	private Node<T, S> parent;
	private boolean color;

	private T key;
	private S object;

	Node(Node<T, S> leftChild, Node<T, S> rightChild, Node<T, S> parent, boolean color, T key, S object) {
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.parent = parent;
		this.color = color;
		this.key = key;
		this.object = object;
	}
	
	
	public Node<T, S> getLeftChild(){
		return leftChild;
	}

	public Node<T, S> getRightChild(){
		return rightChild;
	}
	
	public Node<T, S> getParent(){
		return parent;
	}

	public boolean getColor(){
		return color;
	}

	public T getKey(){
		return key;
	}
	
	public S getObject(){
		return object;
	}

	
	public void setLeftChild(Node<T, S> element){
		this.leftChild = element;
	}
	
	public void setRightChild(Node<T, S> element){
		this.rightChild = element;
	}
	
	public void setParent(Node<T, S> element){
		this.parent = element;
	}
	
	public void setColor(boolean color){
		this.color = color;
	}
		
	public void setKey(T key){
		this.key = key;
	}

	public void setObject(S object){
		this.object = object;
	}
	
	public String toString(){
		String clr = color ? "Schwarz" : "Rot";
		return ("[" + key + "]" + clr);
	}
	
}
