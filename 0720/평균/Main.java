package 평균;

    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Scanner;

    public class Main {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int count = sc.nextInt();
            ArrayList<Integer> sortList = new ArrayList<>();
            ArrayList<Integer> list = new ArrayList<>();
            double[] resultArray = new double[count];
            double result = 0.0;
            for (int i = 0; i < count; i++) {
                list.add(sc.nextInt());
                sortList.add(list.get(i));
            }
            sortList.sort(Collections.reverseOrder());

            for (int i = 0; i < list.size(); i++) {
                resultArray[i] =((double) list.get(i) / sortList.get(0) * 100)/list.size();
            }
            for (int i = 0; i < list.size(); i++) {
                result = result + resultArray[i];
            }
            System.out.println(result);
        }
    }
