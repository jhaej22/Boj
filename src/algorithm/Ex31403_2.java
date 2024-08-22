package algorithm;

import java.io.*;

public class Ex31403_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String ab = String.valueOf(a) + String.valueOf(b);

        System.out.println(a + b - c);
        System.out.println(Integer.parseInt(ab) - c);
    }
}
