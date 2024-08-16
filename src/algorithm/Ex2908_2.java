package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex2908_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int num2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        System.out.println(Math.max(num1, num2));

    }

}
