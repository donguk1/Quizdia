package JavaEx.Ex;

public class Ex4_04 {
    public static void main(String[] args) {
        int a = 10, b;

        b = a++;
        System.out.printf(" %d \n", b);
        //후치 저장하고 더하기
        b = ++a;
        System.out.printf(" %d \n", b);
        //전치 더하고 저장하기
    }
}
