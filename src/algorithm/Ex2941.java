package algorithm;

import java.io.*;

public class Ex2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = s.length();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'c') {
                if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
                    count--;
                    i++;
                }
            } else if (s.charAt(i) == 'd') {
                if (s.charAt(i + 1) == 'z' && s.charAt(i + 2) == '=') {
                    count -= 2;
                    i += 2;
                } else if (s.charAt(i + 1) == '-') {
                    count--;
                    i++;
                }
            } else if (s.charAt(i) == 'j') {
                if (s.charAt(i - 1) == 'l' || s.charAt(i - 1) == 'n') {
                    count--;
                }
            } else if (s.charAt(i) == 's' || s.charAt(i) == 'z') {
                if (s.charAt(i + 1) == '=') {
                    count--;
                    i++;
                }
            }
        }

        System.out.println(count);
    }
}
