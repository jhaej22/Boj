package algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Ex11651 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Integer[][] arr = new Integer[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1].equals(o2[1])) {
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        });

        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0] + " " + arr[i][1] + "\n");
        }

        System.out.println(sb);
    }
}
