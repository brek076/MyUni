package list;

public interface ListStrategy<T> {
    MyNode<T> add(MyNode<T> head, MyNode<T> newMyNode);
    MyNode<T> del(MyNode<T> head);
}
