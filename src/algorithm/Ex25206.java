package algorithm;

import java.io.*;
import java.util.StringTokenizer;
public class Ex25206 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double score = 0;
        double totalScores = 0;
        double totalGpa = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double gpa = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            switch (grade) {
                case "A+":
                    score = 4.5;
                    break;
                case "A0":
                    score = 4.0;
                    break;
                case "B+":
                    score = 3.5;
                    break;
                case"B0":
                    score = 3.0;
                    break;
                case "C+":
                    score = 2.5;
                    break;
                case "C0":
                    score = 2.0;
                    break;
                case "D+":
                    score = 1.5;
                    break;
                case "D0":
                    score = 1.0;
                    break;
                case "F":
                    score = 0.0;
                    break;
                case "P":
                    continue;
        }

            totalScores += (gpa * score);
            totalGpa += gpa;
    }
        System.out.printf("%.6f" , totalScores / totalGpa);
  }
}
