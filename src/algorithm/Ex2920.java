package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex2920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        String s = null;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr[i] + 1) {
                s = "ascending";
            } else if (arr[i + 1] == arr[i] - 1) {
                s = "descending";
            } else {
                s = "mixed";
                break;
            }
        }

        System.out.println(s);

    }
}
