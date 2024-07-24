package algorithm;

import java.io.*;

/**
 * 분해합 방법 1
 */

public class Ex2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            int num = i; // 생성자를 담아 두는 변수
            int sum = 0; // 생성자의 각 자리숫자의 합을 담아두는 변수

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            } // 각 자리 숫자의 합 구해서 더함

            if (i + sum == n) {
                result = i;
                break;
            } // 생성자를 찾았을 경우
        }

        System.out.println(result);
    }
}
