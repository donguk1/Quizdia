package JavaEx.FrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FW_arraylist {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        LinkedList ll = new LinkedList<>();

//        List 객체에 데이터 추가하기
        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");

//        List 저장된 데이터 수
        int listSize = list.size();

        System.out.println("저장된 데이터 수 : " + listSize);

        System.out.println("1세대 반복문");
//        일반적인 반복문 -- 1세대
//        단점 : 반드시 반복의 횟수를 알고 있어야 사용 가능
//        배열 * 2의 연산 횟수를 가짐(사이즈 비교를 해야 함 여기선 [i < listSize]
        for (int i = 0; i < listSize; i++) {
            System.out.println("이름 : " + list.get(i));
        }

        System.out.println("2세대 반복문");
//        개선된 for 반복문 -- 2세대
//        장점 1세대 반복문의 단점인 반복의 횟수를 알고 있어야 하는 문제점 개선
        for (String name : list) {
            System.out.println("이름 : " + name);
        }

        System.out.println("3세대 반복문");
//        개선된 for 반복문 -- 3세대
//        2세대와 성능의 차이 X
//        자바 1.8부터 사용 가능, 람다식( -> ) 젹용
//        장점 : 2세대보다 코딩해야 하는 라인이 감소
        list.forEach(name -> System.out.println("name : " + name));

        System.out.println("4세대 반복문");
//        개선된 for 반복문 -- 4세대
//        장점 : 3세대에 비동기식 처리 방법 적용 >> 속도가 가장 빠름
//        비동기식은 저장순서에 상관 없이 처리 결과를 가져옴
//        시작은 순서대로 하나 종료를 기다리지 않기에 종료 순을 알수가 없음
//        멀트 스레드 >> 결과 굥유가 안됨
//        parallel 병렬
//        단점 : 처리 완료가 누가 먼저 될지 알 수가 없음. 따라서 모든 경우에 다 쓸 수 없음
        list.parallelStream().forEach(name -> System.out.println("name : " + name));

        System.out.println("1.5세대 반복문");
//        while 반복문 -- 1.5세대 -- for 반복문 1세대보다 처리 속도가 빠름
//        자바 1.7까지 가장 많이 쓰던 반복문
//        단점 코드가 길어짐
//        Iterator 반복만을 위한 데이터 타입
        Iterator<String> it = list.iterator();
//        조건이 it.hasNext 다음 값이 있냐
        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }
    }
}

