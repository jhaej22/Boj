package algorithm;

import java.io.*;

public class Ex10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1;
        String s = br.readLine();
        int len = s.length();

        for (int i = 0; i < (len / 2); i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                n = 0;
            }
        }
        System.out.println(n);

    }
}

// String(문자열) 비교
// 1. == 연산자 사용
// : 문자열의 값을 비교하는 것이 아니라 주소의 참조값을 비교함
// 2. equals() 메서드 사용
// : 문자열의 값을 비교함

// character(문자) 비교
// 1. == 연산자 사용
// : 문자의 값이 서로 같은지 비교함
// 2. equals() 메서드 없음
