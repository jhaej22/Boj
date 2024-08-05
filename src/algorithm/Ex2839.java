package algorithm;

import java.io.*;

public class Ex2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                count += n / 5;
                System.out.println(count);
                return;
            }
            if (n < 3) { // 나머지가 1, 2 인 경우 -> 3, 5로 둘다 안나눠 떨어짐
                System.out.println(-1);
                return;
            }
            n -= 3;
            count++;
        }

        System.out.println(count);
    }
}
