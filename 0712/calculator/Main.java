package src.calculator;

import java.util.Scanner;

public class Main {
    //   1 ≤ A, B ≤ 10,000

    // A+B
    public static int plus(int a, int b) {
        return a + b;
    }

    // A-B
    public static int minus(int a, int b) {
        return a - b;
    }

    // A*B
    public static int multiple(int a, int b) {
        return a * b;
    }

    // A/B
    public static int divide(int a, int b) {
        return a / b;
    }

    // A%B
    public static int remainder(int a, int b) {
        return a % b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(plus(a, b));
        System.out.println(minus(a, b));
        System.out.println(multiple(a, b));
        System.out.println(divide(a, b));
        System.out.println(remainder(a, b));
    }
}


