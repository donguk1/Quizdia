package Quiz;

public class Quiz0329_2 {
    public static void main(String[] args) {
        int i, k;
        int result;

        for (i = 2; i <= 9; i++)
        {
            for (k = 1; k <= 9; k++)
            {
                result = k * i;
                System.out.printf("%d * %d = %d \t", k, i, result);
            }
            System.out.println();
        }
    }
}
