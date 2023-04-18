package Quiz;

import java.io.*;
import java.util.StringTokenizer;

public class Quiz0417F_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = 0;
        //중복된 갯수구할 변수
        int []aa = new int[5];
        for (int i = 0; i < 5; i++) {
            aa[i] = Integer.parseInt(st.nextToken());
            for (int j = 0; j < i; j++) {
                if (aa[i] == aa[j]) {
                    n++;
                    //입력한 값이 중복 되었을 경우 증가
                }
            }
        }
        bw.write("저장된 값은 ");
        int []bb = new int[n];
        //중복한 값 만큼의 2번째 배열
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < i; j++) {
                    if (aa[i] == aa[j]) {
                        bb[k] = aa[i];
                       if (k == 0) {
                            i = 4;
                            j = 4;
                            //bb 배열 첫 번째 자리에 변수가 입력 될시 강제로 다음으로 전환
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(bb[i] + " "));
        }
        bw.write("입니다.");
        br.close();
        bw.flush();
        bw.close();

    }
}
