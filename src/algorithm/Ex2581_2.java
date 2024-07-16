package algorithm;

import java.io.*;

/**
 * boolean을 이용하여 소수를 찾는 방법
 */

public class Ex2581_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int min = n;
        int sum = 0;

        for (int i = m; i <= n; i++) {
            // true: 소수    false: 소수 아님
            boolean check = true;
            if (i == 1) {
                check = false;
            } // 1은 소수 아님

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            } // 입력받은 숫자에서 1과 자기자신 뺀 나머지 숫자중에 약수가 있다면 바로 소수 아님

            if (check) { // 소수 통과
                if (i < min) {
                    min = i;
                }
                sum += i;
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum + "\n" + min);
        }
    }
}
