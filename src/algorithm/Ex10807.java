package algorithm;

import java.util.Scanner;

public class Ex10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] num = new int[count];

        for (int i = 0; i < count; i++) {
            num[i] = sc.nextInt();
        }

        int targetNum = sc.nextInt();
        int totalCount = 0;
        for (int i : num) {
            if (i == targetNum) {
                totalCount++;
            }
        }
        System.out.println(totalCount);
    }
}
