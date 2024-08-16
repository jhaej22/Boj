package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Ex2869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); // 낮에 올라가는 높이
        int b = Integer.parseInt(st.nextToken()); // 밤에 내려가는 높이
        int v = Integer.parseInt(st.nextToken()); // 총 올라야 하는 높이

        int days = a - b; // 하루에 올라갈 수 있는 높이
        int height = v - b; //

        if (height % days != 0) {
            System.out.println(height / days + 1); // 낮에 도착 못함 -> 하루 더걸림
        } else {
            System.out.println(height / days); // 낮에 도착
        }
    }
}
