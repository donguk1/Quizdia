package JavaEx.Ex_7;

import java.util.Scanner;

public class Ex7_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int menu;

        do {
            System.out.print("\n 손님 주문하시겠습니다 ? \n");
            System.out.print(" <1>카페라떼 <2>카푸치노 <3>아메리카노 <4>그만시킬래요 => ");

            menu = s.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("#카페라떼 주문하셨습니다.\n");
                    break;
                case 2:
                    System.out.print("#카푸치노 주문하셨습니다.\n");
                    break;
                case 3:
                    System.out.print("아메리카노 주문하셨습니다.\n");
                    break;
                case 4:
                    System.out.print("주문하신 커피 준비하겠습니다.\n");
                    break;
                default:
                    System.out.print("잘못 주문하셨습니다. \n");
            }
        } while (menu != 4);

    }
}
