package src.multiple;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arrNumber = Stream.of(String.valueOf(b).split("")).mapToInt(Integer::parseInt).toArray();

        for (int i = arrNumber.length-1; i >= 0; i--) {
            int result = a * arrNumber[i];
            System.out.println(result);
        }
            System.out.println(a*b);

    }
}
