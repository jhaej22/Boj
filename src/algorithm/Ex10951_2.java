package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex10951_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;
        StringBuilder sb = new StringBuilder();

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b).append("\n");
        }

        System.out.println(sb);
    }
}
