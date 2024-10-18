package exc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.err.println(e.getLocalizedMessage());
        } catch (InputMismatchException e){
            System.err.println(e.getLocalizedMessage());

        }
    }

}
