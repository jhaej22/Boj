package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ex10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }
        for (int var : arr) {
            System.out.print(var + " ");
        }
    }
}

// 아스키 코드표 이용
// 1. 문자(숫자) - '0' -> 문자에 해당하는 숫자(정수형)으로 바꿔줌
// ex) 4(문자) - '0' = 52(정수) -48(정수) = 4(정수)
// 2. 문자(알파벳) - 'a' -> 해당 알파벳순으로 몇번쨰인지 바꿔줌
// ex)  c(문자) - 'a' -> 99 - 97 = 2번째