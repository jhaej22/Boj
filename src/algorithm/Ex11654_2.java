package algorithm;

import java.io.*;

public class Ex11654_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = (int) s.charAt(0); // char -> int 형변환

        System.out.println(n);
    }
}

// '0' -> 48
// '8' -> 56
// 'A' -> 65
// 'P' -> 80
// 'a' -> 97
// 아스키 코드 사용할 때는 char, int로 다뤄줌
// char -> int : int n = char; (int) 넣어줘도 되고 안 넣어줘도 됨
// int -> char : char ch = (char) int
