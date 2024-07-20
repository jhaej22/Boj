package algorithm;

import java.io.*;

/**
 * 알고리즘의 수행시간 3
 * : o(1) + n * o(1) * n * o(1) + o(1)
 * = o(n^2)
 */

public class Ex24264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());

        System.out.println(n * n);
        System.out.println(2);
    }
}

// int형은 대략 10억이 넘어가면 오버플로우 발생 가능
// 문제에서 n <= 500,000이므로 n * n을 하면 10억이 넘어갈 수 있음
