package algorithm;

import java.io.*;

public class Ex1157_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int[26];
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                alphabet[str.charAt(i) - 'A']++;
            } else {
                alphabet[str.charAt(i) - 'a']++;
            }
        }

        int max = -1;
        char ch = 'A';
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                ch = (char) (i + 'A');
            } else if (alphabet[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);

    }
}

// 값이 바뀌는 지점
// 최대값과 본인의 값이 같을 때
// 최대값보다 본인의 값이 클 때
