package algorithm;

import java.util.Scanner;

public class Ex10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}

// java.util.Scanner.hasNextInt() 메서드
// public boolean hasNextInt()
// 반환값: Scanner 객체에 입력값이 int값일 때만 true를 반환

// 동작 과정
// 입력값이 들어올 때까지 while문 내부가 실행되지 않다가
// 입력값이 들어온 후 hasNextInt()메서드가 참 거짓 값을 반환시킨다.
// 그후 while문 내부가 실행됨
