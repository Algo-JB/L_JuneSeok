package src.AminusB;

import java.util.Scanner;

public class Main {

    public static int minus(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        // 0<A, B<10
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(minus(a, b));

    }
}
