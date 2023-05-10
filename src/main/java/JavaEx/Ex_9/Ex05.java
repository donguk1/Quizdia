package JavaEx.Ex_9;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, strRep, strRep2, strSub, strAry[];

        System.out.print("문자열을 입력하세요 : ");
        str = sc.nextLine();

        strRep = str.replace(" ", "$");
        strRep2 = str.replaceAll("\\s", "\\$");
//        s는 스페이스 공백을 의미. 특수 문자이기에 역슬래시 사용.
        strSub = str.substring(3,8);
        strAry = str.split(" ");

        System.out.println("입력 문자열 : " + str);
        System.out.println("바꾼 문자열 : " + strRep);
        System.out.println("바꾼 문자열 : " + strRep2);
        System.out.println("일부 문자열 : " + strSub);

        for (int i = 0; i < strAry.length; i++) {
            System.out.println("분리한 문자열 " + i + "==>" + strAry[i]);
        }
    }
}
