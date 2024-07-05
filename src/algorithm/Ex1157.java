package algorithm;

import java.io.*;

public class Ex1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];

        // 입력 받은 문자열을 탐색
        for (int i = 0; i < str.length(); i++) {
            if (65 <= str.charAt(i) && str.charAt(i) <= 90) {
                arr[str.charAt(i) - 65]++; // 알파벳이 대문자인 경우
            } else {
                arr[str.charAt(i) - 97]++; // 알파벳이 소문자인 경우
            }
        }

        // 알파벳 배열을 탐색
        int max = -1;
        char ch = '?';
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
