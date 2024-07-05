package algorithm;

public class UsingAsciiCode {
    public static void main(String[] args) {
        // 문자 -> 숫자
        int num = 'a';
        System.out.println(num);

        // 숫자 -> 문자
        char ch = (char) 97;
        System.out.println(ch);

        // 숫자 - 문자 -> 숫자 - 숫자로 바뀜
        int num2 = 99 - 'W';
        System.out.println(num2);

    }
}
