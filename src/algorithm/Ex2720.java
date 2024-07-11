package algorithm;

import java.io.*;

/**
 * 세탁소 사장 동혁 -> 잔돈 게산 문제
 * 2차원 배열을 이용하는 방법
 * 다 입력한 후 마지막에 한번에 출력됨
 */

public class Ex2720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][4];

        for (int i = 0; i < n; i++) {
            int money = Integer.parseInt(br.readLine());
            arr[i][0] = money / 25;
            money %= 25;

            arr[i][1] = money / 10;
            money %= 10;

            arr[i][2] = money / 5;
            money %= 5;

            arr[i][3] = money / 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
