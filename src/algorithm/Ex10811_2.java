package algorithm;

import java.io.*;
import java.util.StringTokenizer;
public class Ex10811_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int temp;

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken()) - 1;
            int q = Integer.parseInt(st.nextToken()) - 1;
            for (int j = p; j < q; j++) {
                for (int k = j + 1; k <= q; k++) {
                    temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
