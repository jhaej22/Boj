package algorithm;

import java.io.*;
import java.util.Arrays;

/**
 * 정렬 2
 * : 메서드를 이용하여 오름차순으로 정리
 * : 역순으로 출력
 */

public class Ex1427_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }

        Arrays.sort(arr); // 오름차순

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        } // 역순으로 출력 -> 즉 내림차순
    }
}
