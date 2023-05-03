package Ex_9;

import java.util.Scanner;

public class Ex11 {
    public static int coffee_machine(int button) {
        System.out.print("\n# 1. (자동으로) 뜨거운 물을 준비한다\n");
        System.out.print("# 2. (자동으로) 종이컵을 준비한다\n");

        switch (button) {
            case 1:
                System.out.println("# 3. (자동으로) 보통커리를 탄다");
                break;
            case 2:
                System.out.println("# 3. (자동으로) 설탕커피를 탄다");
                break;
            case 3:
                System.out.println("# 3. (자동으로) 블랙커리를 탄다");
                break;
            default:
                System.out.println("# 3. (자동으로) 아무거나 탄다");
                break;
        }

        System.out.println("# 4. (자동으로) 물을 붓는다");
        System.out.println("# 5. (자동으로) 스푼으로 저어서 녹인다\n");

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coffee;
        int ret;

        System.out.print("어떤 커피 드릴까요? (1: 보통, 2: 설탕, 3: 블랙) ");
        coffee = sc.nextInt();

        ret = coffee_machine(coffee);

        System.out.println("손님 커피 여기 있습니다.");
    }

}
