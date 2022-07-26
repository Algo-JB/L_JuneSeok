package 상수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[2];
        ArrayList<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            String a = sc.next();
            ArrayList<String> list = new ArrayList<>();
            for (int c = 0; c < a.length(); c++) {
                list.add(a.substring(c, c + 1));
            }
            String save = list.get(0);
            list.set(0, list.get(2));
            list.set(2, save);

            for (int x = 0; x < 2; x++) {
                String numberArray = String.join("", list);
                number[x] = Integer.parseInt(numberArray);
                if (number[0] > number[1]) {
                    numberList.add(number[0]);
                    break;
                } else {
                    numberList.add(number[1]);
                    break;
                }
            }
        }
        Collections.sort(numberList);
        System.out.println(numberList.get(1));
    }
}
