package algorithm;

import java.io.*;

public class Ex3052_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        boolean bl;
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        for (int i = 0; i < 10; i++) {
            bl = false;
            for (int j = i + 1; j < 10; j++) {
                if (arr[i] == arr[j]) {
                    bl = true;
                    break; // 같은 수가 있다면 탈출
                }
            }
            if (bl == false) {
                cnt++; // 같은 수가 남은 부분에서 없다면 +1
            }
        }

        System.out.println(cnt);
    }
}
