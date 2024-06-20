package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UsingBufferedReader {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하기 위해서는 throws IOException을 해주어야 함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언

        int n = Integer.parseInt(br.readLine()); // readline()메서드로 받은 입력 데이터는 String
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        br.close(); // 입력 작업이 끝난 후 사용할 필요가 없다면 close()메서드를 통해 입력 스트림을 닫고 사용하던 자원을 해제
    }
}
