package algorithm;

import java.io.*;
import java.util.StringTokenizer;
public class Ex11005_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            if (num % b >= 10) {
                sb.append((char)(num % b + 55));
            } else {
                sb.append(num % b);
            }
            num /= b;
        }

        System.out.println(sb.reverse());
    }
}
