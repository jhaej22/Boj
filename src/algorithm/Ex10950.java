package algorithm;

import java.util.Scanner;

public class Ex10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int a, b;

        for (int i = 0; i < count; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a + b);
        }
    }
}
