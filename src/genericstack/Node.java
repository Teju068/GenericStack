package genericstack;

/**
 * 
 * @author tvishwakarma
 *
 * @param <T>
 * Its Generic Node which accepts all kinds of objects
 */
public class Node<T> {

	T object;
	Node<T> next;

	Node(T object , Node<T> next){
		this.object = object;
		this.next = next;
	}
	
	/**
	 * @return Object
	 */
	public T getObject() {
		return object;
	}

	/**
	 * @param object
	 *  set Object
	 */
	public void setObject(T object) {
		this.object = object;
	}

	/**
	 * returns next Node
	 * @return Node<T>
	 */
	public Node<T> getNext() {
		return next;
	}

	/**
	 * @param next
	 * set Next of current node
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}	
}
