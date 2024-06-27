package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * StringTokenizer를 이용하는 방법
 */

public class Ex2675_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < count; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}

// length vs length()
// length는 int[], double[], float[], String[] 등의 배열의 크기를 구함
// length()는 문자열의 길이를 구함
