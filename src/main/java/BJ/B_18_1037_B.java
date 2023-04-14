package BJ;

import java.io.*;
import java.util.StringTokenizer;

public class B_18_1037_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int []aa = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            aa[i] = Integer.parseInt(st.nextToken());
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

        int a = aa[0] * aa[n-1];

        bw.write(String.valueOf(a));

        br.close();
        bw.flush();
        bw.close();
    }
}
