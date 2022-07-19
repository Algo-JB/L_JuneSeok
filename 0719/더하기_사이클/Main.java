package 더하기_사이클;


// 0 보다 크거나 같고 99보다 작거나 같은 정수
// 10 보다 작으면 0을 붙여 두자리로 만들고 각 자리를 더한다.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // 0~99
    // 1~9 + 0
    // 그 다음 주어진 숫자 xy 에서 x를 떼서 붙임
    // x+y = z => z+y = a => y+a => ?

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int count = 0;
        int copy = N;
        while (true) {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            count++;

            if (copy == N) {
                break;
            }

        }
        System.out.println(count);
    }
}
