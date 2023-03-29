package Ex_6;

public class Ex6_14 {
    public static void main(String[] args) {
        int i, k;
        int result;

        for (i=2; i<=9; i++)
        {
            for (k = 1; k <= 9; k++)
            {
                result = i * k;
                System.out.printf("%d * %d = %d \n", i, k, result);
            }
            System.out.print("\n");
        }
    }
}
