package algorithm;

import java.io.*;

/**
 * 수학은 체육과목입니다
 * : 규칙을 찾을 때 먼저 전체를 보면 쉽게 풀릴 때가 있음
 * : 만약 그렇지 않다면 그 다음 기준을 갖고 세부의 규칙을 찾아야 함
 */
public class Ex15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long perimeter = 0;

        for (int i = 0; i < n; i++) {
            perimeter += 1;
        }

        System.out.println(perimeter + n + (n * 2));
    }
}
