package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex2563_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[100][100];
        int totalArea = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for (int j = a; j < a + 10; j++) {
                for (int k = b; k < b + 10; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        totalArea++;
                    }
                }
            }
        }

        System.out.println(totalArea);
    }
}
