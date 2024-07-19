package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex14215_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int sum = a + b + c;

        int max = 0;
        if (a > b) {
            if (b > c) {
                max = a;
            } else {
                max = (a > c) ? a : c;
            }
        } else {
            max = (b > c) ? b : c;
        }
    }
}
