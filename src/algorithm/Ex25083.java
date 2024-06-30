package algorithm;

public class Ex25083 {
    public static void main(String[] args) {
        System.out.println("         ,r'\"7");
        System.out.println("r`-_   ,'  ,/");
        System.out.println(" \\. \". L_r'");
        System.out.println("   `~\\/");
        System.out.println("      |");
        System.out.println("      |");
    }
}

// 이스케이프 시퀀스(Escape Sequence)
// : 출력문에서 백슬래시가 등장하는 순간 바로 다음 문자를 인식해 상황에 맞게 처리
// 입력           출력
// \'     ->      '
// \"     ->      "
// \\     ->      \
// 따옴표나 역슬래시를 문자열로 출력하고 싶다면 문자 바로 앞에 역슬래시를 넣어주자!
// \n     ->      줄바꿈
// \t     ->      탭
// \0     ->      빈칸(null)