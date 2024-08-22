package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex2475 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 5; i++) {
            sum += (int) Math.pow(arr[i], 2);
        }

        System.out.println(sum % 10);

    }
}
