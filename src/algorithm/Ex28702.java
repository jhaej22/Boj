package algorithm;

import java.io.*;

public class Ex28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 3; i > 0 ; i--) {
            String s = br.readLine();
            if (s.matches("^[0-9]*$")) {
                int num = Integer.parseInt(s) + i;
                if (num % 3 == 0) {
                    if (num % 5 == 0) {
                        System.out.println("FizzBuzz");
                        return;
                    } else {
                        System.out.println("Fizz");
                        return;
                    }
                } else if (num % 5 == 0) {
                    System.out.println("Buzz");
                    return;
                } else {
                    System.out.println(num);
                    return;
                }
            }
            }
        }
    }

