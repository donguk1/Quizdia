package Quiz;

import java.util.Scanner;

public class Quiz0411_S {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int []arr = new int[5]; //5칸짜리 배열 선언
        int hap = 0;            //추후 평균을 위한 배열에 들어간 값을 더할 변수

        for (int i = 0; i < 5; i++) {   //배열에 적기 위해 반복할 변수
            arr[i] = s.nextInt();       //배열에 작성
            hap += arr[i];              //배열에 작성한 값을 더함
        }

        int t;                  //정렬을 위한 추가 변수
        //작은 값부터 큰값으로 정렬하기 위한 반복문
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i] < arr[j]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println("가장 큰 값 : " + arr[4]);   //배열의 마지막에 위차한 값 출력
        System.out.println("가장 작은 값 : " + arr[0]); //배열의 첫번째 위치한 값 출력
        System.out.println("평균 값 : " + hap/5);      //평균값 출력

    }
}
