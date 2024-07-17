package algorithm;

import java.io.*;
import java.util.StringTokenizer;
import static java.lang.Math.sqrt;

/**
 * 직사각형에서 탈출
 * 틀린 풀이
 * : 점과 점 사이의 거리를 구할 필요 없음
 * : 비교 기준은 2개가 아니라 4개임
 */

public class Ex1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        double len1 = sqrt(Math.pow(w - x, 2) + Math.pow(h - y, 2));
        double len2 = sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        if (len1 >= len2) {
            if (x >= y) {
                System.out.println(y);
            } else {
                System.out.println(x);
            }
        } else {
            if (w - x >= h - y) {
                System.out.println(h - y);
            } else {
                System.out.println(w - x);
            }
        }
    }
}
