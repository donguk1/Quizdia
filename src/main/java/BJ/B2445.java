package BJ;

import java.io.*;

public class B2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
//           늘어나는 별의 줄수
            for (int j = 0; j < i + 1; j++) {
                bw.write("*");
            }
            for (int j = (i*2); j < n*2-2; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                bw.write("*");
            }
            for (int j = 0; j < (i + 1) * 2; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < n - i - 1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }



        br.close();
        bw.flush();
        bw.close();
    }
}
