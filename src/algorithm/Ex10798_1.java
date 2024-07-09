package algorithm;

import java.io.*;
public class Ex10798_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j); // 입력 받은 문자열의 길이만큼 문자 배열에 넣어줌
            }
        }

        for (int i = 0; i < arr[0].length; i++) { // 열의 길이가 최대 15까지 이므로 열의 갯수 만큼 출력해줌
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == 0) { // 입력 받은 문자가 없으면 문자 == 0 으로 비교함
                    continue;
                }
                System.out.print(arr[j][i]);
            }
        }
    }
}
