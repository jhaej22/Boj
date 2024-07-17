package algorithm;

import java.io.*;

import static java.lang.Math.sqrt;

/**
 * 소인수 분해 알고리즘 : 제곱근 이용해서 좀 더 효율적으로 찾음
 */

public class Ex11653_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= sqrt(n); i++) {
            while (n % i == 0) {
                sb.append(i + "\n");
                n /= i;
            }
        }

        if (n != 1) {
            sb.append(n);
        }

        System.out.println(sb);

    }
}
