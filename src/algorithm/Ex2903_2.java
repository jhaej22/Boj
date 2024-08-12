package algorithm;

import java.io.*;

public class Ex2903_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println((int)Math.pow(Math.pow(2,n) + 1, 2));
        // double -> int : 명시적 형변환
    }
}
