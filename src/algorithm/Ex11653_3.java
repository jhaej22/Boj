package algorithm;

import java.io.*;

public class Ex11653_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n != 1) {
            for (int i = 2; i <= n ; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                    n /= i;
                    break; // 2로 나누어떨어지면 for문 탈출 후 다시 2로 나누어 떨어지는지 확인
                }
            }
        }
    }
}
