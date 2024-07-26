package algorithm;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 블랙잭 방법 1
 */

public class Ex2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int sum = 0, result = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        } // 배열에 카드(숫자) 담기

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum > result && sum <= m) {
                        result = sum;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
