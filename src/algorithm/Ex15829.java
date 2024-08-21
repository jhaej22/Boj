package algorithm;

import java.io.*;

public class Ex15829 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        long sum = 0;
        long m = 1234567891;
        long r = 1;

        for (int i = 0; i < n; i++) {
            sum += ((s.charAt(i) - 'a' + 1) * r) % m;
            r = (r * 31) % m;
        }

        System.out.println(sum % m);
    }
}
