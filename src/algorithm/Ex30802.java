package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex30802 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t_shirt = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        for (int i = 0; i < arr.length; i++) {
            t_shirt += (arr[i] / t);
            if (arr[i] % t != 0) {
                t_shirt++;
            }
        }

        System.out.println(t_shirt);
        System.out.println(n / p + " " + n % p);
    }
}
