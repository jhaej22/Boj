package algorithm;

import java.util.Scanner;

public class Ex2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        min -= 45;

        if (min < 0) {
            if (hour == 0) {
                hour = 23;
            } else {
                hour--;
            }
            min += 60;
        }
        System.out.println(hour + " " + min);
    }
}

// b: 45보다 작냐 크냐
// a: 0이냐 아니냐
