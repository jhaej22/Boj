package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex10250_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int x, y = 0;

            if (n % h == 0) {
                sb.append((h * 100) + (n / h) + 1 + "\n");
            } else {
                sb.append((n % h) * 100 + (n / h) + 1 + "\n");

            }
        }

        System.out.println(sb);

    }
}
