package algorithm;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 직사각형에서 탈출
 * 맞는 풀이
 * : 문제 그대로 주어진 (x, y)에서 각 변까지의 거리 4개를 구한 뒤
 * : 그 중에서 최솟값을 찾으면 됨
 * : 점과 점 사이의 거리가 아니라 점과 직사각형의 변 사이
 */

public class Ex1085_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int len1 = Math.min(x, w - x);
        int len2 = Math.min(y, h - y);

        System.out.println(Math.min(len1, len2));
    }
}
