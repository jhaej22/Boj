package algorithm;

import java.io.*;

public class Ex2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = s.length();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'c' && i < len - 1) {
                if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
                    count--;
                    i++;
                }
            } else if (s.charAt(i) == 'd' && i < len - 1) {
                if (s.charAt(i + 1) == '-') {
                    count--;
                    i++;
                } else if (s.charAt(i + 1) == 'z' && i < len - 2) {
                    if (s.charAt(i + 2) == '=') {
                        count -= 2;
                        i += 2;
                    }
                }

            } else if ((s.charAt(i) == 'l' || s.charAt(i) == 'n') && i < len - 1) {
                if (s.charAt(i + 1) == 'j') {
                    count--;
                    i++;
                }
            } else if ((s.charAt(i) == 's' || s.charAt(i) == 'z') && i < len - 1) {
                if (s.charAt(i + 1) == '=') {
                    count--;
                    i++;
                }
            }
        }

        System.out.println(count);
    }
}
