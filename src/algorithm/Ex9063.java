package algorithm;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 대지
 * 내 풀이
 * : x와 y 좌표를 받아 각각의 배열을 만든 뒤
 *   각각의 배열에서 최솟값과 최댓값을 찾음
 */

public class Ex9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arrX = new int[n];
        int[] arrY = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrX[i] = Integer.parseInt(st.nextToken());
            arrY[i] = Integer.parseInt(st.nextToken());
        }


        int x = findValue(arrX, n);
        int y = findValue(arrY, n);
        System.out.println(x * y);
    }

    private static int findValue(int[] arr, int n) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return max - min;
    }

}
