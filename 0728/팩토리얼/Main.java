package 팩토리얼;

import java.util.Scanner;

public class Main {
    public static int facto(int N) {
        int result = 1;
        for (int i = 0; i < N; i++) {
            result = result * (N-i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(facto(N));
    }
}
