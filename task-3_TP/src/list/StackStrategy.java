package list;

public class StackStrategy<T> implements ListStrategy{

    @Override
    public MyNode add(MyNode head, MyNode newMyNode) {
        newMyNode.setNext(head);
        return newMyNode;
    }

    @Override
    public MyNode del(MyNode head) {
        return null;
    }


}
