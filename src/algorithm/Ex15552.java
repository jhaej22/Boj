package algorithm;

import java.io.*;

public class Ex15552 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            bw.write(a + b + "\n");
        }
        bw.flush();
    }
}

// BufferedReader, BufferedWriter
// 버퍼를 사용하지 않는 입력: 키보드의 입력이 키를 누르는 즉시 바로 프로그램에 전달된다.
// 버퍼를 사용하는 입력: 키보드의 입력이 있을 때마다 한 문자씩 버퍼로 전송된다.
// 버퍼가 가득차거나 개행문자가 나타나면 버퍼의 내용을 한번에 프로그램에 전달한다.
// BufferedReader의 readline()메서드는 String으로 리턴값이 고정되어 있다.
// 다른 타입으로 바꾸고 싶다면 형변환을 해주어야 한다.
// 예외처리를 반드시 해줘야하므로 throws IOException을 통해 예외처리를 해주자.
