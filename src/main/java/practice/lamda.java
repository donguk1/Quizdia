package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lamda {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(5);
        li.add(3);
        li.add(6);
        li.add(1);
        li.add(2);
        li.add(4);

        Collections.sort(li);

        li.forEach((number) -> System.out.print(number + " "));
    }
}
