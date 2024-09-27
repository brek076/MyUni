import java.util.Scanner;

// Пример задачи
// x 0 1 2 3
// y 2 0,5 1 4
// Neew X = 1.6
// Answer = 0,8

// Пример из задачи с доски
// x 0,1 0,2 0,4
// y 10 5 2,5
// Neew X = 0,25
// Answer = 3,4375
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во x и y: ");
        int size = in.nextInt();

        double[][] table = inTable(size);
        printTable(table);

        System.out.print("Введите Х, для которого нужно найти значение: ");
        double X = in.nextDouble();

        // Выясняем, какой отрезок брать, для вычислений
        int [] bordersId = analiz(table, X);

        // Вычисляем
        double answer = func(X, table[0][bordersId[0]], table[0][bordersId[1]], table[1][bordersId[0]], table[1][bordersId[1]]);
        System.out.println("Ответ: " + answer);
    }

    public static double func(double x, double x1, double x2, double y1, double y2) {
        return y1 + ((y2 - y1) / (x2 - x1)) * (x - x1);
    }

    public static int[] analiz(double[][] table, double x){
        for (int j = 0; j < table[0].length - 1; j++) {
            if(table[0][j] <= x && x <= table[0][j+1]){
                return new int[] {j, j+1};
            }
        }
        return new int[] {-1, -1};
    }

    public static double[][] inTable(int size) {
        Scanner in = new Scanner(System.in);
        double[][] table = new double[2][size];
        for (int i = 0; i < 2; i++) {
            if (i == 0)
                System.out.print("Ввод значений Х :");
            else
                System.out.print("Ввод значений Y :");

            for (int j = 0; j < size; j++) {
                table[i][j] = in.nextDouble();
            }
        }
        return table;
    }

    public static void printTable(double[][] table) {
        for (int i = 0; i < table.length; i++) {
            if (i == 0)
                System.out.print("x | ");
            else
                System.out.print("y | ");

            for (int j = 0; j < table[0].length; j++) {
                System.out.print(table[i][j] + " | ");
            }
            System.out.println();
        }
    }
}