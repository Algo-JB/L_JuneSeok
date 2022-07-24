package 문자열_반복;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();

        for (int i = 0; i < times; i++) {
            ArrayList<String> list = new ArrayList<>();
            int repeat = sc.nextInt();
            String text = sc.next();

            for (int z = 0; z < text.length(); z++) {
                    for (int a = 0; a < repeat; a++) {
                    System.out.print(text.charAt(z));
                }
            }
            System.out.println();

        }
    }
}
