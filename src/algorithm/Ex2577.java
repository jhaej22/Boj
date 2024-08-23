package algorithm;

import java.io.*;

public class Ex2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int result = a * b * c;
        int[] arr = new int[10];

        while (result != 0) {
            arr[result % 10]++;
            result /= 10;
        }



        for (int i : arr) {
            System.out.println(i);
        }
    }
}
