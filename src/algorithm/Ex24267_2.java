package algorithm;

import java.io.*;


public class Ex24267_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());

        System.out.println(n * (n -1) * (n - 2) / 6);
        System.out.println(3);
    }
}
