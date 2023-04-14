package BJ;

import java.io.*;

public class B_13_2750_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int []aa = new int[n];

        for (int i = 0; i < n; i++) {
            aa[i] = Integer.parseInt(br.readLine());
        }

        int t = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (aa[i] < aa[j] ) {
                    t = aa[i];
                    aa[i] = aa[j];
                    aa[j] = t;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(aa[i] + "\n"));
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
