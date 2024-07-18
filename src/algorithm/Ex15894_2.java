package algorithm;

import java.io.*;
public class Ex15894_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        // int와 long의 경계값인 10^9 이므로 long형으로 선언해줘야함

        System.out.println(4 * n);
    }
}
