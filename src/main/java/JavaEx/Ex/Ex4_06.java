package JavaEx.Ex;

public class Ex4_06 {
    public static void main(String[] args) {
        int a = 99;

        System.out.printf(" AND 연산 : %s \n", (a >= 100) && (a <=200));
        // a 가 100보다 이상이며 200보다 이하면 F
        System.out.printf(" OR 연산 : %s \n", (a >= 100) || (a <=200));
        // a 가 100보다 이상이거나  200보다 이하면 T
        System.out.printf(" NOT 연산 : %s \n", !(a >= 100));
        // a 가 100보다 크지않고 같지 않으면 T
    }
}
