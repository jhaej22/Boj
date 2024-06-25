package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        int[] basket = new int[n];
        int temp;

        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < count; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st2.nextToken()) - 1;
            int k = Integer.parseInt(st2.nextToken()) - 1;

            while (j < k) {
                temp = basket[j];
                basket[j] = basket[k];
                basket[k] = temp;
                j++;
                k--;
            }
        }

        for (int i : basket) {
            System.out.print(i + " ");
        }
    }
}
