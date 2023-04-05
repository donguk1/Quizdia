package Quiz;

public class Quiz0403_2 {
    public static void main(String[] args) {
        int i, j;
        j = 2; // 2단부터 실행

        for (i = 1; i <= 9; i++) {
            System.out.printf(j + "*" + i + "=" + j * i); //j단의 *1부터 *9까지 반복
            System.out.print("\t"); //tab 으로 간격 조정
            if (i == 9) {// *9까지 마쳤을 경우 실행
                j++; //단수 증가
                i = 0; //다시 *1부터 실행하기 위하여 0으로 대입
                System.out.println(); //단수 끝나면 줄 넘김
            }
            if (j == 10) { //9단이 끝나고 10으로 넘어갔을 경우 실행
                break;
            }
        }
    }
}

