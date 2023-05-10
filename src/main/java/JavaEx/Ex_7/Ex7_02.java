package JavaEx.Ex_7;

public class Ex7_02 {
    public static void main(String[] args) {
        int hap = 10, i = 0;

        while (i <= 10) {
            hap += i;
            i++;
        }
        System.out.printf("1에서 10까지의 합 : %d \n", hap);
    }
}
