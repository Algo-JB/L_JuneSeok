package src.compareAB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//    첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        // A가 B보다 큰 경우 >
        if (a > b) {
            System.out.println(">");
        // A가 B보다 작은 경우 <
        } else if (a < b) {
            System.out.println("<");
        // A와 B가 같은경우 ==
        } else {
            System.out.println("==");
        }






    }
}
