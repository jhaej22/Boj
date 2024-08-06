package algorithm;

import java.io.*;

/**
 * 풀이 2
 * : counting 정렬 이용하기
 */

public class Ex10989_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001]; // 입력받을 수 있는 숫자의 범위 1~10000
        // 인덱스는 0부터 시작이므로 배열의 크기는 0~10000을 입력받을 수 있는 10001

        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        } // 입력받은 숫자에 해당하는 인덱스의 배열의 값을 1씩 증가시킴
          // 만약 5를 입력받으면
          // arr[5] = 0 -> 1

        br.close();

        for (int i = 0; i < 10001; i++) {
            while (arr[i] > 0) { // 만약 동일한 숫자가 입력된다면 배열에는 2이므로 1씩 빼주면서 출력
                bw.write(i + "\n");
                arr[i]--;
            }
        }

        bw.flush();
        bw.close();
    }
}
