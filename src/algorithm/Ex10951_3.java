package algorithm;

import java.io.*;

public class Ex10951_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder sb = new StringBuilder();

        while ((str = br.readLine()) != null) {
            int a = str.charAt(0) - '0';
            int b = str.charAt(2) - '0';
            sb.append(a + b).append("\n");
        }

        System.out.println(sb);
    }
}
