package 평균은_넘겠지;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        ArrayList<Double> percent = new ArrayList<>();


        for (int i = 0; i < testCase; i++) {
            int sum = 0;
            int count = 0;
            ArrayList<Integer> score = new ArrayList<>();

            int people = sc.nextInt();

            for (int a = 0; a < people; a++) {
                score.add(sc.nextInt());
            }
            for (int a = 0; a < score.size(); a++) {
                sum = sum + score.get(a);
            }

            for (int z = 0; z < score.size(); z++) {
                if (score.get(z) > sum / score.size()) {
                    count += 1;
                }
            }
            percent.add(((double) count / (double) score.size()) * 100);
        }

        for (int i = 0; i < percent.size(); i++) {
            System.out.printf(String.format("%.3f", percent.get(i)));
            System.out.println("%");
        }
    }
}


