package JavaEx.FrameWork;

import java.util.*;

public class listmapEX {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        최종 저장되는 List 구조
        List<Map<String, String>> list = new ArrayList<>();

//        List 구조 안에 저장될 Map 객체
        Map<String, String> map = null;

//            3명만 입력
        for (int i = 0; i < 3; i++) {

//            이름
            System.out.print("이름 : " );
            String name = s.next();
//            이메일
            System.out.print("이메일 : " );
            String email = s.next();
//            부서
            System.out.print("부서 : " );
            String dept = s.next();

//            List 구조에 저장할 Map 메모리에 올리기(import java.util.어쩌구);
            map = new HashMap<>();

//            입력받은 값을 name 키에 저장
            map.put("name", name);
//            입력받은 값을 email 키에 저장
            map.put("email", email);
//            입력받은 값을 dept 키에 저장
            map.put("dept", dept);

//            Map 구조를 List 에 저장(추가)
            list.add(map);

//            다 사용한 메모리 비우기
            map = null;
        }

//        List 에 저장된 데이터 수
        int listSize = list.size();

        System.out.println("저장된 데이터 수 : " + listSize);

//        1세대 반복문
//        단점 : 반복 횟수를 알고 있어야 사용 가능
        System.out.println("1세대");

        for (int i = 0; i < listSize; i++) {
//            list 의 i 번째 값 가져오기
            Map<String, String> rMap = list.get(i);


            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));

            rMap = null;
        }

//        2세대 반복문
//        장점 : 1세대와 달리 반복횟수를 몰라도 됨
        System.out.println("2세대");
        for (Map<String, String> rmap : list) {
            System.out.println("name : " + rmap.get("name"));
            System.out.println("email : " + rmap.get("email"));
            System.out.println("dept : " + rmap.get("dept"));
        }

//        3세대 반본문
//        장점 2세대보다 코딩 라인이 줆
//        람다식( -> ) 적용, 1.8 버전부터 사용 가능
        System.out.println("3세대");

        list.forEach(rMap -> {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));


        });

    }
}
