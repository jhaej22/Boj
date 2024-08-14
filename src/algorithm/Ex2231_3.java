package algorithm;

import java.io.*;

public class Ex2231_3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int num = i;

            while (num != 0) {
                sum += (num % 10);
                num /= 10;
            } // 입력받은 수의 각자리 숫자 합 더하기

            if (i + sum == n) {
                result = i;
                break;
            } // 만약 생성자가 맞으면 result변수에 저장해줌
        }

        System.out.println(result);
    }
}
