package list;

public class MySimpleList<T> {
    private int length = 0;
    public MyNode<T> head = null;

    private ListStrategy<T> listStrategy;

    public MySimpleList(ListStrategy<T> strategy) {
        listStrategy = strategy;
    }

    public int getLength() {
        return length;
    }

    public void add(T element) {
        MyNode<T> newMyNode = new MyNode<>(element);

//        head = newMyNode;

        if(head == null){
            head = newMyNode;
        } else {
            head = listStrategy.add(head, newMyNode);
        }
        length++;
    }


    public void setListStrategy(ListStrategy<T> listStrategy) {
        this.listStrategy = listStrategy;
    }


    public void del(T t){

    }

    public void print(){
        System.out.println();
    }

}
