package src.0715.AplusB3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int[] a = new int[testCase];
        int[] b = new int[testCase];
        int[] result = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            result[i] = a[i] + b[i];
        }
        for (int i = 0; i<testCase; i++){
            System.out.println(result[i]);
        }

//    첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//     각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
    }
}
