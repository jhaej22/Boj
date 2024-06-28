package algorithm;

import java.io.*;

/**
 * 입력 받을 때 종료 조건을 어떻게 설정할까에 대한 것이 문제의 포인트
 */

public class Ex11718 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;

        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
    }
}
