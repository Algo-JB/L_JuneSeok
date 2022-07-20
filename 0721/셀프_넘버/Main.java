package 셀프_넘버;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] array = new String[count];
        for (int i = 0; i < count; i++) {
            array[i] = sc.next();
            for (int y = 0; y < array[i].length(); i++) {
                System.out.print(array[i].charAt(y) + " ");
            }
        }


    }

}
