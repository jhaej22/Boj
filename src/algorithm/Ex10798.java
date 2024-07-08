package algorithm;

import java.io.*;

public class Ex10798 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[6][6];

        for (int i = 0; i < 6; i++) {
            String s = br.readLine();
            for (int j = 0; j < 6; j++) {
                if (s.charAt(j) == ' ') {
                    arr[i][j] = ' ';
                } else {
                    arr[i][j] = s.charAt(j);
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (arr[j][i] == ' ') {
                    continue;
                } else {
                    System.out.print(arr[j][i]);
                }
            }
        }
    }
}
