package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_3_2739BF {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());


        for (int i = 1; i <= 9; i++) {
            System.out.println(a + " * " + i + " = " + a*i);
        }
        br.close();
    }
}
