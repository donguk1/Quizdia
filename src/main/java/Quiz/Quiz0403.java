package Quiz;

public class Quiz0403 {
    public static void main(String[] args) {
        int i, j;

        j = 2;
        for (i = 1; i < 10; i++){
            System.out.print(j + "*" + i + "=" + i*j);
            System.out.print("\t");

            if (i == 9) {
                j++;
                i = 0;
                System.out.println();
            }
            if (j == 10) {
                break;
            }
        }
    }
}
