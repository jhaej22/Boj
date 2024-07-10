package algorithm;

import java.io.*;
import java.util.StringTokenizer;
public class Ex11005 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken()); // 변환해야하는 10진법 수
        int b = Integer.parseInt(st.nextToken()); // 10진법에서 변환해야 하는 진법 수

        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            if (num % b >= 10) { // 알파벳으로 바꿔주는 경우
                sb.append((char) (num % b + 55));
            } else { // 숫자 그대로 출력하는 경우
                sb.append(num % b);
            }
            num /= b;
        }

        System.out.println(sb.reverse());
    }
}
