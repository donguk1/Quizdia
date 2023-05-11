package BJ;

import java.io.*;
import java.util.StringTokenizer;

public class B_6_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int []aa = new int[Integer.parseInt(st.nextToken())];
            double sum = 0;
//            점수 용
            double count = 0;
//            평균 이상 학생 구하기 용
            for (int j = 0; j < aa.length; j++) {
                aa[j] = Integer.parseInt(st.nextToken());
                sum += aa[j];

            }
            sum /= aa.length;
            for (int j = 0; j < aa.length; j++) {
                if (aa[j] > sum) {
                    count++;
                }
            }


            System.out.printf("%.3f%% \n", count * 100 / aa.length);

        }

        br.close();

    }
}
