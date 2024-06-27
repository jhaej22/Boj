package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * BufferedReader의 split()메서드를 이용하는 방법
 */
public class Ex2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");

            int count = Integer.parseInt(arr[0]);
            String s = arr[1];

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < count; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }

    }
}
