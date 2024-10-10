

public class Main {
    public static void main(String[] args) {

        list.QueueStrategy<Integer> queueStrategy = new list.QueueStrategy<>();
        list.StackStrategy<Integer> stackStrategy = new list.StackStrategy<>();
        list.MySimpleList<Integer> list = new list.MySimpleList<>(queueStrategy);
        list.add(5);
        list.add(7);
        list.setListStrategy(stackStrategy);
        list.add(10);
        list.add(154);
    }
}
