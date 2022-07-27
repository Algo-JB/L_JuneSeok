package 손익분기점;

import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        // 고정비용 : A
        // 생산비용(가변) : B
        // 노트북 가격 : C

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = 0;
        int B = 0;
        int C = 0;
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (C <= B) {
            bw.write(-1 + "");
            bw.close();
        } else {
            System.out.println((A / (C - B)) + 1);
        }
    }
}
