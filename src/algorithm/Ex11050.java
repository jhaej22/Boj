package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        br.close();

        bw.write(factorial(n) / (factorial(k) * factorial(n - k)) + "\n");
        bw.flush();
        bw.close();
    }

    private static int factorial(int num) {
        if (num == 0) {
            return 1;
        }

        return num * factorial(num - 1);
    }
}
