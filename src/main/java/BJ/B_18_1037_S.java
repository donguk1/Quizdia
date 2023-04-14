package BJ;

import java.util.Scanner;

public class B_18_1037_S {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int []aa = new int[n];

        for (int i = 0; i < n; i++) {
            aa[i] = s.nextInt();
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

        System.out.print(a);

    }
}
