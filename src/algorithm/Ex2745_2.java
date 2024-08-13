package algorithm;

import java.io.*;
import java.util.StringTokenizer;
public class Ex2745_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken(); // 변환해야할 수
        int n = Integer.parseInt(st.nextToken()); // 진법 수
        int result = 0; // 변환한 수
        int temp = 1; // 각 자리마다 진법 수의 거듭제곱을 곱해서 더함
        int num = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 90) {
                num = c - 65 + 10;
            } else {
                num = c - 48;
            }
            result += temp * num;
            temp *= n;
        }

        System.out.println(result);
    }
}
