package JavaEx.Ex_7;

public class EX7_11 {
    public static void main(String[] args) {
        int hap = 0, i;

        for( ; ; ) {
            for (i = 1; i <= 100; i++) {
                hap += i;
                if(hap > 2000) {
                    System.out.printf("%d \n", hap);
                    hap = 0;
                    break;
                }
            }
            System.out.print("아직도 반복중...\n");
        }
    }
}
