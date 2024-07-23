package algorithm;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 알고리즘 수업 - 점근적 표기 1
 * : 정의에서 모든 n >= n0에 대해 f(n) <= c * g(n)이 만족해야 하는데
 * : n0일때만 식을 확인하면 그보다 큰 값은 무조건 성립함
 * : n이 무한대로갈때까지 고려할 필요 없음
 */

public class Ex24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        if (a1 * n0 + a0 <= c * n0 && c >= a1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
