package algorithm;

import java.io.*;
import java.util.Arrays;

/**
 * 정렬 구현
 * : Arrays 클래스의 정렬 메서드 이용하기
 */
public class Ex2750_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        // 기본적으로 오름차순으로 배열 정렬

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
