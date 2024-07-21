package algorithm;

import java.io.*;

/**
 * 알고리즘의 수행 시간 6
 */
public class Ex24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        System.out.println(n * (n - 1) * (n - 2) / 6); // nCr = n! / (n - r) ! / r! 와 동일
        System.out.println(3);
    }
}
