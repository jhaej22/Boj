package algorithm;

import java.util.Scanner;

public class Ex2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println(10000 + (a * 1000));
        } else if (a == b || a == c) {
            System.out.println(1000 + (a * 100));
        } else if (b == c) {
            System.out.println(1000 + (b * 100));
        } else {
            int max;
            if (a >= b) {
                if (a >= c) {
                    max = a;
                } else {
                    max = c;
                }
            } else {
                if (b >= c) {
                    max = b;
                } else {
                    max = c;
                }
            }
            System.out.println(max * 100);
        }

    }
}
