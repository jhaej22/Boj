package algorithm;

import java.io.*;

/**
 * 세탁소 사장 동혁 -> 잔돈 계산 문제
 *  굳이 2차원 배열에 담을 필요없이 바로 계산값을 출력하는 방법
 *  돈을 입력할 때마다 바로 출력됨
 */

public class Ex2720_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;

        for (int i = 0; i < t; i++) {
            int money = Integer.parseInt(br.readLine());
            System.out.print(money / q + " ");
            money %= q;
            System.out.print(money / d + " ");
            money %= d;
            System.out.print(money / n + " ");
            money %= n;
            System.out.println(money / p + " ");
        }
    }
}
