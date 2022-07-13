package src.remainer;

import java.util.Scanner;

public class Main {
//    (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
//     첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    //(A+B)%C
    int result1 = (a + b) % c;

    //((A%C) + (B%C))%C
    int result2 = ((a % c) + (b % c)) % c;

    // (A*B)%C
    int result3 = (a * b) % c;

    // ((A%C) * (B%C))%C
    int result4 = ((a % c) * (b % c)) % c;


    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
}


}
