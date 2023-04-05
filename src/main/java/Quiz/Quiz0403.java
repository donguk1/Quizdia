package Quiz;

public class Quiz0403 {
    public static void main(String[] args) {
        int i, j;

        j = 2; //2단부터 시작
        for (i = 1; i < 10; i++){ // 1 ~ 9 를 반복하기 하기
            System.out.print(j + "*" + i + "=" + i*j); // 결과 출력
            System.out.print("\t"); //출력후 tab을 사용해 간격 조정

            if (i == 9) { //9까지 곱했을 경우 진행
                j++; //단수가 끝나면 다음 단수를 위해 단수 증가
                i = 0; //9에서 0으로 바꿔 반복문 다시 실행
                System.out.println(); // 단이 끝났으니 줄 바꿈
            }
            if (j == 10) { //9단까지 끝냈을 경우 반복문 탈출
                break;
            }
        }
    }
}
