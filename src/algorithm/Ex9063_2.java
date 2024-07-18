package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex9063_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int minX = 10000, maxX = -10000;
        int minY = 10000, maxY = -10000;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }

        int x = maxX - minX;
        int y = maxY - minY;
        System.out.println(x * y);
    }
}
