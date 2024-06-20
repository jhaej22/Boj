package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int targetNum = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i : arr) {
            if (i < targetNum) {
                System.out.print(i + " ");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
