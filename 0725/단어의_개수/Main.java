package 단어의_개수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        text = text.trim();
        if (text.isEmpty() == false) {
            String[] textArray = text.split("\\s");
            System.out.println(textArray.length);
        }
        else {
            System.out.println(0);
        }
    }
}
