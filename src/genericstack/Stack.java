package genericstack;

public class Stack<T> {

	int size;
	T object;
	Node<T> start = null;

	Stack(){

	}

	Stack(T object, Node<T> node){
		this.object = object;
		this.start = node;
	}

	public void push(T data) {
		size++;
		Node<T> node = new Node<T>(data, null);
		if(start == null) {
			start = node;
		}else {
			node.setNext(start);
			start = node;
		}
	}

	public T pop() {
		size--;
		Node<T> poppedNode;
		poppedNode = start;
		start = start.getNext();
		return poppedNode.getObject();
	}

	public T peek() {
		return start.getObject();
	} 

	public Node<T> getTop(){
		return start;
	}
}
