package algorithm;

import java.io.*;

public class Ex2292_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int max = 1;

        while (true) {
            if (n == 1) {
                System.out.println(1);
                break;
            } else {
                if (n >= max + 1 && n <= max + count * 6) {
                    System.out.println(count + 1);
                    break;
                }
                max += count * 6;
                count++;
            }
        }
    }
}
