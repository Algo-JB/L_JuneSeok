package year1998_2541;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buddha = sc.nextInt();
        int domini = buddha - 543; // 불기 -> 서기
        System.out.println(domini);
    }
}
