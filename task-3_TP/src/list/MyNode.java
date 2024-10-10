package list;

public class MyNode<T> {
    public T value;
    public MyNode<T> next = null;

    public MyNode() {

    }
    public MyNode(T value) {
        this.value = value;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }
}
