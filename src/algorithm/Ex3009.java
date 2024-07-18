package algorithm;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 네 번째 점
 * : x좌표와 y좌표의 배열을 따로 세로로 만들 수 있음
 * : 배열 인덱스를 사용해서 비교하기 애매할 때는 직접 비교하자
 */

public class Ex3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arrX = new int[3];
        int[] arrY = new int[3];
        int x = 0;
        int y = 0;

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrX[i] = Integer.parseInt(st.nextToken());
            arrY[i] = Integer.parseInt(st.nextToken());
        }

        if (arrX[0] == arrX[1]) {
            x = arrX[2];
        } else {
            x = (arrX[0] == arrX[2]) ? arrX[1] : arrX[0];
        }

        if (arrY[0] == arrY[1]) {
            y = arrY[2];
        } else {
            y = (arrY[0] == arrY[2]) ? arrY[1] : arrY[0];
        }

        System.out.println(x + " " + y);
    }
}
