package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int sum = a + b + c;

        int max = Math.max(a, b);
        max = Math.max(max, c);

        if (max >= sum / 2) {
            System.out.println(2 * (sum - max) - 1);
        } else {
            System.out.println(sum);
        }
    }
}
