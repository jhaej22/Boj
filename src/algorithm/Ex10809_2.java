package algorithm;

import java.io.*;

public class Ex10809_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            if (arr[index] == -1) {
                arr[index] = i;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
