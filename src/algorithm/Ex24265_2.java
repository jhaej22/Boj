package algorithm;

import java.io.*;
public class Ex24265_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());

        System.out.println(n * (n - 1) / 2);
        System.out.println(2);
    }
}

// 자연수의 합 (1 부터 n까지)
// n * (n + 1) / 2
// n * (n - 1) / 2 : 1부터 n - 1까지의 합

// n <= 500,000인데
// n * n이 될 수 있으므로 int형 범위를 초과할 수 있음
// int형 보다 큰 long형을 써야함

// 기본 자료형
// 부울 대수: boolean
// 정수:  byte < short < int < long
// 실수: float < double
// 문자: char
