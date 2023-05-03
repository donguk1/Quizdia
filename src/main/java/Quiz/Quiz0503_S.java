package Quiz;

import java.util.HashSet;
import java.util.Scanner;

public class Quiz0503_S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        LinkedList<Integer> lli = new LinkedList<Integer>();
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            hs.add(sc.nextInt());
        }
        System.out.println(hs);

    }

}
