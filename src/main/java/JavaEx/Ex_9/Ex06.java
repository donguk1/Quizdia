package JavaEx.Ex_9;

public class Ex06 {
    public static void main(String[] args) {
        String str = "   한글    ABCD  efgh";

        System.out.println("원 문자열 : [" + str + "]");
        System.out.println("대 문자로 : [" + str.toUpperCase() + "]");
        System.out.println("소 문자로 : [" + str.toLowerCase() + "]");
        System.out.println("공백 제거 : [" + str.trim() + "]");
    }
}
