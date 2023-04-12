package Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz0411_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int []arr = new int[5];
        int hap = 0, k = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            hap += arr[i];
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i] < arr[j]) {
                    k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }

            }
        }
        System.out.printf("가장 큰 값 : %d \n", arr[4]);
        System.out.printf("가장 작은 값 : %d \n", arr[0]);
        System.out.printf("평균 값 : %d \n", hap/5);
    }
}
