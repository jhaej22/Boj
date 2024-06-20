package algorithm;

import java.util.StringTokenizer;

public class UsingStringTokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("HelloJava!, new World", ",");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}

// 1. 띄어쓰기를 기준으로 문자열을 분리
// StringTokenizer = new StringTokenizer(문자열);
// 2. 구분자를 기준으로 문자열을 분리
// StringTokenizer = new STringTokenizer(문자열, 구분자);
