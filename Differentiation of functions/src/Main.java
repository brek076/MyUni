// диф-у функций, Програ - продиф-ть y=sin(x)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите кол-во x и y: ");
//        int size = in.nextInt();
//
//        double[][] table = inTable(size);
//        printTable(table);
//        double[][] table = new double[][] {{0,1,2,3,4},{0,1,8,27,64}};

//        System.out.println(Math.abs(getCenterDiff(8,0,1, 2)));
//        System.out.println(Math.abs(getCenterDiff(27,1,2, 3)));
//        System.out.println(Math.abs(getCenterDiff(64,8,3, 4)));

        int size = 5;
        double step = t();
        double[][] table = createTableFunc(size, step);
        printTable(table);
        printCenterDiff(table);
    }

    public static double[][] createTableFunc(int size, double step){
        double[][] table = new double[2][size];
        for(int i = 0; i < size; i++){
            table[0][i] = i * step;
            table[1][i] = Math.sin(Double.valueOf(Double.valueOf(i)));
        }
        return  table;
    }

    public static double t (){
        return  Math.PI * 1/6;
    }

    public static void printCenterDiff( double[][] table){
        System.out.print("Центральные разностные производные:");
        for(int i = 1; i < table[0].length - 1; i++){
            System.out.print(getCenterDiff(table[1][i+1], table[1][i-1], table[0][i], table[0][i-1]) + " ");
        }
        System.out.println();
    }

    public static double getCenterDiff(double y1, double y2, double x1, double x2) { // y+1, y-1, x,x-1
        return Math.abs((y1 - y2) / (2 *(x1 - x2)));
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
