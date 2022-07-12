package src.AmultipleB;

import java.util.Scanner;

public class Main {
    //    0 < A, B < 10)
    public static int multiple(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(multiple(a, b));
    }
}
