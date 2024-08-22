package algorithm;

public class UsingStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aaa");

        // 문자열 추가
        System.out.println(sb.append("bbb")); // aaabbb
        System.out.println(sb.append(4)); // aaabbb4

        // 문자열 삽입
        System.out.println(sb.insert(2, "ccc")); // aacccabbb4

        // 문자열 치환
        System.out.println(sb.replace(3, 6, "ye")); // aacyebbb4

        // 문자열 자르기
        System.out.println(sb.substring(5)); // bbb4
        System.out.println(sb.substring(3, 7)); // yebb

        // 문자 삭제
        System.out.println(sb.deleteCharAt(3)); // aacebb4

        // 문자열 삭제
        System.out.println(sb.delete(3, sb.length())); // aac

        // 문자열 변환
        System.out.println(sb.toString()); // aac

        // 문자열 뒤집기
        System.out.println(sb.reverse()); // caa

    }
}
