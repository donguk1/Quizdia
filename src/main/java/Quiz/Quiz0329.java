package Quiz;

import java.util.Scanner;

public class Quiz0329 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("입력값 : ");
        int a = s.nextInt();


        if (a % 6 == 0) {
            System.out.println("2의 배수와 3의 배수를 만족합니다.");
        }
        else if(a % 2 == 0)
        {
            System.out.println("2의 배수입니다.");
        }
        else if(a % 3 == 0)
        {
            System.out.println("3의 배수입니다.");
        }
    }
}
