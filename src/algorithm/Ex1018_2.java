package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex1018_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] board1 = new String[n];

        for (int i = 0; i < n; i++) {
            board1[i] = br.readLine();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int result = getMinCost(i, j, board1);
                if (result < min) {
                    min = result;
                }
            }
        }

        System.out.println(min);

    }

    private static int getMinCost(int a, int b, String[] board) {

        String[] board2 = {"WBWBWBWB", "BWBWBWBW"};
        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            int row = a + i;
            for (int j = 0; j < 8; j++) {
                int column = b + j;
                if (board[row].charAt(column) != board2[row % 2].charAt(j)) {
                    cnt++;
                }
            }
        }

        return Math.min(cnt, 64 - cnt);
    }


}
