package ACM_호텔;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {


            int H = sc.nextInt(); // 층
            int W = sc.nextInt();
            int N = sc.nextInt(); // 번째 손님

            int floor = 0;
            int width = 0;

            if ((N % H) == 0) {
                floor = H * 100;
                width = (N / H);
            } else {
                floor = (N % H) * 100;
                width = (N / H) + 1;
            }
            System.out.println(floor + width);
        }
    }
}
