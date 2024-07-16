package algorithm;

import java.io.*;

/**
 * 배열 이용
 */
public class Ex9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }

            int[] arr = new int[n];
            int count = 0;
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    if (n != i) {
                        arr[count] = i;
                        count++;
                        sum += i;
                    }
                }
            }

            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < count; i++) {
                    if (i == count - 1) {
                        System.out.println(arr[i]);
                        break;
                    }
                    System.out.print(arr[i] + " + ");

                }
            } else {
                System.out.println(n + " is NOT perfect.");
            }

        }
    }
}
