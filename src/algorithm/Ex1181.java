package algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Ex1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        for (int i = 0; i < n; i++) {
            if (i != 0) {
                if (!arr[i].equals(arr[i - 1])) {
                    System.out.println(arr[i]);
                }
            } else {
                System.out.println(arr[i]);
            }
        }
    }
}
