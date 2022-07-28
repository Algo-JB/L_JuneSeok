package 피보나치_수_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static int fibonacci(int N) {
        ArrayList<Integer> F = new ArrayList<>();
        F.add(0);
        F.add(1);

        for (int i = 1; i <= N; i++) {
            F.add(F.get(i)+F.get(i-1));
        }
        return F.get(N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fibonacci(N));
    }
}
