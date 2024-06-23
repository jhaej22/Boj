package algorithm;

import java.io.*;
import java.util.StringTokenizer;
public class Ex10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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
            int l = Integer.parseInt(st2.nextToken());
            int m = Integer.parseInt(st2.nextToken());
            temp = basket[l - 1];
            basket[l - 1] = basket[m - 1];
            basket[m - 1] = temp;
        }

        for (int i : basket) {
            bw.write(i + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
