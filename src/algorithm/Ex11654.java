package algorithm;

import java.io.*;

public class Ex11654 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        br.close();

        int n = (int) str.charAt(0); // 문자를 정수형 변수에 담음
        System.out.println(n);
    }
}
