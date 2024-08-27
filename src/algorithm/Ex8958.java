package algorithm;

import java.io.*;

public class Ex8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int result = 0;
            int count = 0;
            String s = br.readLine();

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                result += count;
            }

            System.out.println(result);
        }
    }
}
