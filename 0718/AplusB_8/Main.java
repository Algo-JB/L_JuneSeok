package AplusB_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int x[] = new int[a];
        int y[] = new int[a];
        int result[] = new int[a];
        for (int i = 0; i < a; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            result[i] = x[i] + y[i];
        }
        for (int i = 1; i <= a; i++) {
            System.out.println("Case #" + i + ": " + x[i - 1] + " + " + y[i - 1] + " = " + result[i - 1]);
        }
    }
}
