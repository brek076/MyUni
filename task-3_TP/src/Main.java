import Fabric.EllipseMaker;
import Fabric.RectangleMaker;

import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {

    }

    public static  void testFabric(){
        RectangleMaker RM = new RectangleMaker();
        EllipseMaker EM = new EllipseMaker();
        var renctagleDouble =  RM.buildShape();
        var ellipseDouble =  EM.buildShape();

        System.out.println(renctagleDouble);
        System.out.println(ellipseDouble);
    }

    public static void testList(){
        list.QueueStrategy<Integer> queueStrategy = new list.QueueStrategy<>();
        list.StackStrategy<Integer> stackStrategy = new list.StackStrategy<>();
        list.MySimpleList<Integer> list = new list.MySimpleList<>(queueStrategy);
        list.add(5);
        list.add(7);
        list.setListStrategy(stackStrategy);
        list.add(10);
    }

}
