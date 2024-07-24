package algorithm;

import java.io.*;

/**
 * 분해합 방법 2 (브루트 포스)
 * : 완전 탐색 알고리즘이긴 하지만
 * : 최솟값을 생각해서 탐색하는 범위를 좁힐 수 있음
 */
public class Ex2231_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n_str = br.readLine();
        int n_len = n_str.length();
        int n = Integer.parseInt(n_str);
        int result = 0;

        for (int i = n - (n_len * 9); i < n; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                sum += (num % 10);
                num /= 10;
            }

            if (i + sum == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
