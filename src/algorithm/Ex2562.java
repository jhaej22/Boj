package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Ex2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int max = arr[0]; // 배열 선언시 값은 자동으로 모두 0으로 초기화 됨
        int index = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) {
                max = arr[i];
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
