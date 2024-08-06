package algorithm;

import java.io.*;
import java.util.Arrays;

/**
 *  풀이 1
 *  : 일반 정렬 사용하기
 */

public class Ex10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        br.close();

        Arrays.sort(arr);

        for (int i : arr) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }
}
