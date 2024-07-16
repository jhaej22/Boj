package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex1978_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            boolean check = true;

            if (num == 1) {
                check = false;
            }

            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                count++;
            }
        }

        System.out.println(count);
    }
}
