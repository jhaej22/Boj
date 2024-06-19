package algorithm;

import java.util.Scanner;

public class Ex2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // 입력 받을 시간
        int b = scanner.nextInt(); // 입력 받을 분
        int c = scanner.nextInt(); // 입력 받아서 더해야할 시간

        a += (c / 60);
        b += (c % 60);

        if (b >= 60) {
            a++;
            b -= 60;
        }

        if (a >= 24) {
            a -= 24;
        }
        System.out.println(a + " " + b);
    }
}

// 입력 값
// 17 40
// 340
// 출력값

// 340 = 60 * 5 + 40
// 5 = 340 / 6 (더할 시간을 구함)
// 40 = 340 % 6 (더할 분을 구함)
// 입력 받은 시간을 시와 분으로 나눈 뒤 다시 각각 더해준다.
