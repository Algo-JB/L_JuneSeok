package 정수_N개의_합;

public class Test {
    //    정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
//    long sum(int[] a); (클래스 이름: Test)
//    a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
//    리턴값: a에 포함되어 있는 정수 n개의 합
    static long ans = 0;

    public static long sum(int[] a) {
        for (int i = 0; i < a.length; i++) {
            ans =  ans + a[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(ans);
    }
}
