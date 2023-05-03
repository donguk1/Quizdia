package Ex_9;

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 : ");
        str = sc.nextLine();

        System.out.print("출력 문자열 : ");

        if ( ! str.startsWith("(")) {
            System.out.print("(");
//          문자열의 시작이 (가 아니면 (를 출력
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.printf("%c", str.charAt(i));
        }

        if (!str.endsWith(")")) {
            System.out.print(")");
//            문자열의 끝이 )가 아니면 )를 출력
        }
    }
}
