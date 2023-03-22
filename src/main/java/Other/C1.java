package Other;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        int b;

        Scanner  z = new Scanner(System.in);

        System.out.printf("값 입력 : ");
        b = z.nextInt();

        System.out.printf("10진수 ==> %d \n", b);
        System.out.printf("16진수 ==> %x \n", b);
        System.out.printf("8진수 ==> %o \n", b);




    }
}
