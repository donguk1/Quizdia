package BJ;

import java.util.Scanner;

public class B_6_2444_S {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 1; i < n+1; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = ((n-i)*2)-1 ; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
