package 달팽이는_올라가고_싶다;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    // 나무의 높이 : V
    // 낮에 올라가는 높이 : A
    // 밤에 내려가는 높이 : B
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int V = 0; // 높이
        int A = 0; // 올라가는 높이
        int B = 0; // 내려가는 높이


        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        double count = 0;
        int track = 0;

        track = V - A; // +1

        count = ((double) track / (double) (A - B)) + 1;

        System.out.println((int)Math.ceil(count));


    }

}
