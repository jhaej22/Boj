package algorithm;

import java.io.*;

public class Ex1316_2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (check()) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static boolean check() throws IOException {
        boolean[] arr = new boolean[26];
        String s = br.readLine();
        int prev = 0;

        for (int i = 0; i < s.length(); i++) {
            int now = s.charAt(i);
            if (prev != now) { // 알파벳이 연속되지 않은 경우
                if (!arr[now - 'a']) {
                    arr[now - 'a'] = true;
                    prev = now; // 나온적이 없는 알파벳
                } else {
                    return false; // 나온적이 있는 알파벳
                }
            }
        }

        // 알파벳이 연속된 경우
        return true;
    }
}
