package algorithm;

import java.io.*;

public class Ex31403 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int ab = Integer.parseInt(sb.append(a).append(b).toString());

        System.out.println(a + b - c);
        System.out.println(ab - c);
    }
}
