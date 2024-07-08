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

    public static boolean check() throws IOException{
        boolean[] arr = new boolean[26];
        String str = br.readLine();
        int prev = 0;

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (prev != now) {
                if (!arr[now - 'a']) {
                    arr[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

}
