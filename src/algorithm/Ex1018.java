package algorithm;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 체스판 다시 칠하기
 * 1. 체스판 입력 받기
 * 2. 체스판 8 * 8로 자르기
 * 3. 자른 체스판과 정답 체스판 비교(화이트 기준)
 * 4. 그 중에서 가장 작은 최소비용 출력
 */

public class Ex1018 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] board = new String[n];

        // 체스판 입력받기
        for (int i = 0; i < n; i++) {
            board[i] = br.readLine();
        }

        // 체스판 8 * 8로 자르기
        int count = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int resultCount = getMinCost(i, j, board);

                if (count > resultCount) {
                    count = resultCount; // 최소비용 갱신하기
                }
            }
        }
        System.out.println(count);
    }

    private static int getMinCost(int startRow, int startCol, String[] board) {
        String[] board2 = {"WBWBWBWB", "BWBWBWBW"}; // 화이트로 시작하는 정답 체스판
        int whiteVerCount = 0;

        for (int i = 0; i < 8; i++) {
            int row = startRow + i; // 매개변수로 자른 체스판이 아니라 전체 체스판이 넘어왔음
            for (int j = 0; j < 8; j++) {
                int col = startCol + j;

                if (board[row].charAt(col) != board2[row % 2].charAt(j)) {
                    whiteVerCount++;
                }
            }
        }

        return Math.min(whiteVerCount, 64 - whiteVerCount);
        // 하얀색으로 바꾸는 비용 + 검은색으로 바꾸는 비용 = 체스판 갯수 총합인 64
    }
}
