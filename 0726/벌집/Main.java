package 벌집;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1->2->9->22->41 ...
        // 점점 6씩 늘어남

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 1; // 최소 루트
        int range = 2; // 범위

        if (N == 1) {
            System.out.println(1);
        } else {
            while (range <= N) {
                range = range + (6 * count);
                count++;
            }
        }

        System.out.println(count);

    }
}

