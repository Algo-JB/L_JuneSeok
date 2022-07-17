package AplusB_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int x = 0;
        int y = 0;
        int result[] = new int[a];
        for (int i = 0; i < a; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            result[i] = x + y;
        }
        for (int i = 1; i <= a; i++) {
            System.out.println("Case #" + i + ": " + result[i-1]);
        }
    }
}