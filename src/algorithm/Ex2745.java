package algorithm;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 진법 변환 문제1
 * n진법 -> 10진법
 */

public class Ex2745 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String num = st.nextToken(); // 변환해야 하는 수
        int n = Integer.parseInt(st.nextToken()); // 진법 수
        int sum = 0; // 변환되어 출력되는 수 (10진법 수)
        int temp = 1; // 각 자리 숫자마다 곱해야하는 수

        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if ('A' <= c && c <= 'Z') {
                sum += (c - 'A' + 10) * temp;
            } else {
                sum += (c - '0') * temp;
            }
            temp *= n; // 자리수가 증가할 떄마다 n을 곱해주어야 함
        }

        System.out.println(sum);
    }
}
