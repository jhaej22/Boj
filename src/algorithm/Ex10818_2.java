package algorithm;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Ex10818_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int index = 0;
        int[] arr = new int[count];
        while (st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        Arrays.sort(arr); // Array.sort() 메서드는 배열의 값을 오름차순으로 정리(작은 것부터)
        System.out.println(arr[0] + " " + arr[count - 1]);
    }
}
