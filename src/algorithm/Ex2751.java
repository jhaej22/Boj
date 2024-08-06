package algorithm;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 정렬: Arrays.sort, 버블정렬 ->  시간복잡도 0(n^2)
 * Collections.sort -> 시간복잡도 o(nlogn)
 */
public class Ex2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        br.close();

        Collections.sort(list);


        for (int i : list) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
    }
}
