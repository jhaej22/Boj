package algorithm;

import java.io.*;
import java.util.StringTokenizer;
public class Ex2566 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        int max = -1;
        int row = 0;
        int column = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i + 1;
                    column = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + column);
    }
}
