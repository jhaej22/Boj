package algorithm;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 블랙잭 방법 2
 */

public class Ex2798_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(findValue(arr, n, m));

    }

    private static int findValue(int[] arr, int n, int m) {
        int sum = 0, temp = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum == m) {
                        return sum; // 합이 m이라면 바로 sum 반환
                    }
                    if (sum > temp && sum < m) {
                        temp = sum; // m보다 작은 sum 중에 제일 큰 근사치를 계속 갱신
                    }
                }
            }
        }
        return temp; // 가장 큰 근사치를 반환
    }
}
