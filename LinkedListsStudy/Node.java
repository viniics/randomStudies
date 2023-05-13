package LinkedListThrowaway;

public class Node<T> {
    private T elemento;
    private Node<T> next;
    private Node<T> prev;
    
    public Node(T elemento) {
        this.elemento = elemento;
        this.next = null;
        this.prev = null;
    }

    public Node(T elemento, Node<T> next) {
        this.elemento = elemento;
        this.next = next;
    }

    @Override
    public String toString() {
        return elemento.toString();
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }
    
    
}
