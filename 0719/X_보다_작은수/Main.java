package X_보다_작은수;

import java.util.Scanner;

public class Main {
    // 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때 A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
    // 첫째 줄 N,X
    // 둘째 줄 수열 A를 이루는 정수 N개가 주어진다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int maxNumber = sc.nextInt();
        int numberList[] = new int[count];

        for (int i = 0; i < count; i++) {
            numberList[i] = sc.nextInt();
            if(numberList[i] < maxNumber){
                System.out.print(numberList[i]+ " ");
            }
        }

    }
}
