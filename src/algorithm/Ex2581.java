package algorithm;

import java.io.*;

/**
 * count를 증가시켜서 소수를 찾는 방법
 */

public class Ex2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = n;

        for (int i = m; i <= n; i++) {
            int count = 1; // 약수 중에서 1은 처음부터 포함
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) { // 해당 숫자가 소수면
                sum += i;
                if (i < min) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
