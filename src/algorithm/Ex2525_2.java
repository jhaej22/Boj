package algorithm;

import java.util.Scanner;

public class Ex2525_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int min = (a * 60) + b;
        min += c;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);
    }
}

// 한번에 분으로 다 더함 -> 다시 시와 분으로 변환
// 입력값
// 14 30
// 20

// 14 * 60 + 30 = 870
// 870 = 60 * 14 + 30
// 870 + 20 = 890
// 890 = 60 * 14 + 50

// 만약 hour가 24이상이라면?
// 25 = 24 * 1 + 1
// 24 = 24 * 1 + 0
// 36 = 24 * 1 + 12
// 21 = 24 * 0 + 21
// -24를 할려면 조건문을 한번 더 써줘야 한다.
