package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] scores = new double[n];
        double max = 0;
        double average = 0;

        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        for (int i = 0; i < n; i++) {
            scores[i] = (scores[i] / max * 100);
            average += (scores[i] / n);
        }

        System.out.println(average);
    }
}
