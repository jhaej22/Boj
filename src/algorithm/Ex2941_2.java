package algorithm;

import java.io.*;

public class Ex2941_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cnt = s.length(); // 알파벳 개수 담는 변수
        int len = s.length(); // 문자 총 길이

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch == 'c' && i < len - 1) {
                if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
                    cnt--;
                    i++;
                }
            } else if (ch == 'd' && i < len - 1) {
                if (s.charAt(i + 1) == '-') {
                    cnt--;
                    i++;
                } else if (s.charAt(i + 1) == 'z' && i < len - 2) {
                    if (s.charAt(i + 2) == '=') {
                        cnt -= 2;
                        i += 2;
                    }
                }
            } else if ((ch == 'l' || ch == 'n') && i < len - 1) {
                if (s.charAt(i + 1) == 'j') {
                    cnt--;
                    i++;
                }
            } else if ((ch == 's' || ch == 'z') && i < len - 1) {
                if (s.charAt(i + 1) == '=') {
                    cnt--;
                    i++;
                }
            }
        }
        System.out.println(cnt);

        }
    }

