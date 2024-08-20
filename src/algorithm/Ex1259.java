package algorithm;

import java.io.*;

public class Ex1259 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while (true) {
            boolean bl = true;
            s = br.readLine();
            if (s.equals("0")) {
                return;
            }

            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    bl = false;
                    break;
                }
            }

            if (bl) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }

    }
}
