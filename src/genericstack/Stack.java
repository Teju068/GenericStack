package genericstack;

public class Stack<T> {

    int size;
    Node<T> start = null;

    Stack() {

    }


    public void push(T data) {
        size++;
        Node<T> node = new Node<>(data, null);
        if (start == null) {
            start = node;
        } else {
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

}
