package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] arr = new int[15][15];
        makeArr(arr);

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            sb.append(arr[a][b]).append("\n");
        }

        System.out.println(sb);

    }

    private static void makeArr(int[][] arr) {

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                arr[0][j] = j;
                arr[i][0] = 0;
            }
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
    }
}
