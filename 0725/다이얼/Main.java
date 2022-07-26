package 다이얼;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> hashMap = new HashMap<>() {{
            put(3, "ABC");
            put(4, "DEF");
            put(5, "GHI");
            put(6, "JKL");
            put(7, "MNO");
            put(8, "PQRS");
            put(9, "TUV");
            put(10, "WXYZ");
        }};
        ArrayList<String> list = new ArrayList<>();

        String[] arrays = hashMap.values().toArray(new String[0]);
        String input = sc.next();
        int inputLength = input.length();

        for (int a = 0; a < inputLength; a++) {
            list.add(input.substring(a, a + 1));
        }

        int length = 0;
        int times = 0;
        int i = 0;
        while (true) {
            if (arrays[i].contains(list.get(length))) {
                times = times + (i + 3);
                i = -1;
                length++;
            }
            if (length == inputLength) {
                break;
            }
            i++;
        }

        System.out.println(times);

    }

}
