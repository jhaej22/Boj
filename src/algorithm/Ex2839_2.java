package algorithm;

import java.io.*;

public class Ex2839_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (n > 0) {
            if (n % 5 == 0) {
                cnt += n / 5;
                break;
            }


            if (n < 3) {
                cnt = -1;
                break;
            }

            n -= 3;
            cnt++;
        }

        System.out.println(cnt);
    }
}
