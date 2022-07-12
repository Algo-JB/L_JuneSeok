package src.AdivideB;

import java.util.Scanner;

public class Main {
    //    0 < A, B < 10)
    public static double divide(int a, int b) {
        return (double) a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(divide(a, b));
    }
}

