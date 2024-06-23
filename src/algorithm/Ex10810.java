package algorithm;

import java.io.*;
import java.util.StringTokenizer;
public class Ex10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        int[] basket = new int[n];

        for (int i = 0; i < count; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st2.nextToken());
            int k = Integer.parseInt(st2.nextToken());
            int l = Integer.parseInt(st2.nextToken());
            for (int m = j; m <= k; m++) {
                basket[m - 1] = l;
            }
        }

        for (int i : basket) {
            System.out.print(i + " ");
        }
    }
}
