package algorithm;

import java.util.Scanner;

public class Ex25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalAmount = sc.nextInt();
        int count = sc.nextInt();
        int amount = 0;

        for (int i = 0; i < count; i++) {
            int price = sc.nextInt();
            int account = sc.nextInt();
            amount += price * account;
        }

        if (totalAmount == amount) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
