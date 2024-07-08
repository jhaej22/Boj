package algorithm;

import java.io.*;

public class Ex1316 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (check()) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (prev != now) { // 앞의 문자와 서로 다를 때
                if (!check[now - 'a']) {
                    check[now - 'a'] = true; // 처음 나온 문자
                    prev = now;
                } else {
                    return false; // 이미 나왔던 문자이지만 불연속 일 때
                }
            }
        }

        return true; // 연속된 문자가 나온 경우
    }
}
