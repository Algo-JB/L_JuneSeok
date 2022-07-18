package AplusB_5;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            result.add(a + b);
            count++;

            if (a == 0 && b == 0) {
                for (int i = 0; i < count-1; i++) {
                    System.out.println(result.get(i));
                }
                break;
            }

        }
    }
}

