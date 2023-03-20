public class Quizdia {
    public static void main(String[] args) {

        int row = 5;
        for(int i = 0; i < row; i++) {
            for(int j=0; j < row - 1 - i; j++) {
                System.out.print(" ");

            }
            for(int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i = row - 1; i > 0; i--) {
            for(int j = 0; j < row - i; j++) {
                System.out.print("");
            }
            for(int j = i*2-1; j > 0; j--) {
                System.out.print("*");
            }
        }
    System.out.println();
    }
}

