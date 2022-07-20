package 최댓값;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int cnt = 0;
        int[] array = new int[9];

        for (int i = 0; i < 9; i++) {
            array[i] = sc.nextInt();
            arrayList.add(array[i]);
        }
        Arrays.sort(array);
        System.out.println(array[8]);

        for (int i = 0; i < 9; i++) {
            cnt++;
            if(array[8] == arrayList.get(i)){
                System.out.println(cnt);
                break;
            }
        }



    }
}
