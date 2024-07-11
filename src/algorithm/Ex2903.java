package algorithm;

/**
 * 중앙 이동 알고리즘
 * 못 푼 이유: 정사각형 기준으로 늘어난 점의 갯수를 세려고 시도 + 중복되는 점의 규칙을 찾으려고 함
 * 해결: 어차피 총 점의 개수만 구하면 됨 -> 한변을 기준으로 점의 규칙성을 찾자
 */

import java.io.*;

public class Ex2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println((int)Math.pow((Math.pow(2,n) + 1),2));
    }
}
