package list;

public class QueueStrategy<T> implements ListStrategy{

    @Override
    public MyNode add(MyNode head, MyNode newMyNode) {
        if (head == null)
            return newMyNode;

        MyNode body = head;
        while (body.getNext() != null) {
            body = body.getNext();
        }
        body.setNext(newMyNode);

        return head;
    }

    @Override
    public MyNode del(MyNode head) {
        return null;
    }


}
