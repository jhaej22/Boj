package algorithm;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class UsingBufferedWriter {
    public static void main(String[] args) throws IOException {
        // BufferedWriter를 사용하기 위해서는 throws IOException으로 예외처리 해줘야 함
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Hello World"); // 출력할 내용을 담음
        bw.flush(); // 버퍼를 비워내면서 콘솔에 출력함
        bw.close(); // 출력이 끝났다면 close()를 통해 출력 스트림을 당음
    }
}
