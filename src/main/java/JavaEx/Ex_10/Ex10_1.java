package JavaEx.Ex_10;

public class Ex10_1 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        try {
            aa[2] = 100 / 0;
            aa[3] = 100;
        } catch (ArithmeticException e) {
            System.out.println("발생 오류 : " + e);
            System.out.println("0으로 나누는 등의 오류");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 첨자가 배열 크기보다 큼");
            System.out.println("오류 메시지 : " + e);
        } catch (Exception e) {
            System.out.println("자바에서 발생되는 모든 에러를 다 잡을 수 있음");
            System.out.println("오류 메시지 : " + e);
        } finally {
            System.out.println("이 부분은 항상 나옴");
        }
    }
}
