package algorithm;

import java.io.*;

public class Ex5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] students = new int[30];

        for (int i = 0; i < 28; i++) {
            int target = Integer.parseInt(br.readLine());
            students[target - 1] = 1;
        }

        for (int i = 0; i < 30; i++) {
            if (students[i] == 0) {
                System.out.println(i + 1);
            }
        }

    }
}
