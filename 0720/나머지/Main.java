package 나머지;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            set.add(array[i] = a % 42);
        }
        System.out.println(set.size());
    }

}
