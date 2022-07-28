package 부녀회장이_될테야;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // a층의 b호에 살려면
        // 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수를 합한만큼 사람들을 데려와 살아야한다.

        // k층의 n호에 몇명이 살아 있는지 출력
        // 아파트는 0층 부터 있고 각층에는 1호부터 있으며 0층의 i호에는 i명이 산다.
        int[][] apt = new int[15][15];

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();


        ArrayList<Integer> result = new ArrayList<>();




        for (int i = 0; i < 15; i++) {
            apt[i][1] = 1;
            apt[0][i] = i;
        }

        for (int i = 1; i < 15; i++) { // 1층 ~ 14층
            for (int j = 2; j < 15; j++) { //2호 ~ 14호
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }

        for(int i = 0; i<testCase; i++){
            int a = sc.nextInt(); // 층
            int b = sc.nextInt(); // 호
            System.out.println(apt[a][b]);
        }

    }
}
