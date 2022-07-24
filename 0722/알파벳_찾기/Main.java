package 알파벳_찾기;

import java.util.Scanner;

public class Main {


    public static void location(String text) {
        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }
        for(int val : arr){
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        location(text);
    }
}
