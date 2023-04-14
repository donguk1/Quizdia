package BJ;

import java.io.*;

public class B_17_15439_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int a = n * (n - 1);

        bw.write(String.valueOf(a));

        br.close();
        bw.flush();
        bw.close();

    }
}
