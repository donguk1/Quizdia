package Ex_9;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 ==> ");
        str = sc.nextLine();

        System.out.print("출력 문자열 ==> ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                System.out.printf("%c", '$');
            }else
                System.out.printf("%c", str.charAt(i));
        }
        System.out.println();
        System.out.println(str.replaceAll("o", "&"));
//        위에 있는 포문과 같은 효과
//        replaceAll: regex를 replacement로 변환
    }
}
