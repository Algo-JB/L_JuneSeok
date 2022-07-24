package 숫자의_합;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int loop = sc.nextInt();
        int sum = 0;
        String num = sc.next();
        for (int i = 0; i < loop; i++) {
            list.add(num.substring(i, i + 1));
        }
        for (int i = 0; i < list.size(); i++) {
            sum = sum + Integer.parseInt(list.get(i));
        }
        System.out.println(sum);
    }

}
