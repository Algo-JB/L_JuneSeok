package 주사위_세개;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1~6 주사위 3개
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();

        // 같은 눈 3 개 10000+(같은눈) * 1000
        if (dice1 == dice2 && dice2 == dice3) {
            System.out.println(10000 + (dice1 * 1000));

            // 같은 눈이 2개만 나오는 경우 1000+(같은눈)*100
        } else if (dice1 == dice2 || dice1 == dice3 || dice2 == dice3) {
            if (dice1 == dice2) {
                System.out.println(1000 + (dice1 * 100));
            } else if (dice1 == dice3) {
                System.out.println(1000 + (dice1 * 100));
            } else {
                System.out.println(1000 + (dice2 * 100));
            }
            // 모두 다른 눈이 경우에는 (그중가장큰눈)*100
        } else {
            int higher = Math.max(dice1, Math.max(dice2, dice3));
            System.out.println(higher * 100);
        }
    }


}
