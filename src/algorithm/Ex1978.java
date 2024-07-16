package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            int count = 1;
            int num = Integer.parseInt(st.nextToken());
            for (int j = 2; j <= num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                result++;
            }
        }
        System.out.println(result);
    }
}
