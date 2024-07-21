package algorithm;

import java.io.*;

/**
 * 알고리즘의 수행시간 4
 */
public class Ex24265 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());

        System.out.println(n * (n - 1) / 2);
        System.out.println(2);
    }
}
