package Ex;

import java.util.Scanner;

public class Ex5_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("점수를 입력하세요 : ");
        int a = s.nextInt();

        if (a >= 90) {
            System.out.printf("A");
        }
        else if (a >= 80) {
            System.out.printf("B");
        }
        else if (a >= 70) {
            System.out.printf("C");
        }
        else if (a >= 60) {
            System.out.printf("D");
        }
        else {
            System.out.printf("F");
        }
        System.out.printf(" 학점 입니다.\n");
    }
}