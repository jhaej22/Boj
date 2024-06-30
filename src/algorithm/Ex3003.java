package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - Integer.parseInt(st.nextToken());
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
