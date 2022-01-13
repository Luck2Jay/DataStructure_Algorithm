import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int mode= 0; // 횟수
            int score=0; //점수
            int num = sc.nextInt(); //테스트케이스 넘버

            int[] cnt = new int[101]; // 0~100 : 101개의 점수가 나온 횟수를 담을 배열
            for (int i = 0; i < 101; i++) cnt[i] = 0; // 0으로 초기화

            int[] arr = new int[1000]; // 학생 1천명의 점수를 담을 배열
            for (int i = 0; i < 1000; i++) {
                arr[i]  = sc.nextInt();
            }

            for(int i=0;i<1000;i++){ // 점수 배열
                int temp = arr[i]; // 점수를 인덱스로 사용하는 cnt배열에 사용할 temp 변수
                cnt[temp] = cnt[temp] + 1; //학생의 점수에 해당하는 인덱스의 cnt 요소 1 증가
            }

            mode = cnt[0];

            for(int i=1; i < 101; i++){ // 0점~100점 비교
                if(mode<=cnt[i]) {
                    mode = cnt[i];
                    score = i;
                }
            }

            System.out.println("#"+num+" "+ score );

        }
    }
}