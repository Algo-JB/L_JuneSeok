package src.alarm;

import java.util.Scanner;

public class Main {
    //    첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M < 45) {
            H = H - 1;
            M = (M + 60) - 45;

            if (H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " + (M - 45));

        }

    }

}

