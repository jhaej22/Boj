package algorithm;

import java.io.*;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Ex2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        // System.out.println(Math.max(a, b));
        System.out.println(a > b ? a : b);
    }
}

// String은 불변 객체이므로 값이 바뀔 때마다 새로운 객체가 생성
// StringBuilder는 가변 객체이므로 새로운 객체가 계속 생성되지는 않음
