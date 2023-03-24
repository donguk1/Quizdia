package BJ;

import java.util.Scanner;

public class B_2_1330 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a > b) {
            System.out.printf("> \n");
        } else if (a < b) {
            System.out.printf("< \n");
        } else if (a == b) {
            System.out.printf("==");
        }


    }
}
