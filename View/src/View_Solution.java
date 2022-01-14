import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = 10; // 테스트 케이스 개수

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int h = sc.nextInt(); // 건물의 개수
            int[] a = new int [h];
            for(int i=0;i<h;i++){ // 입력받을 테스트 케이스
                a[i] = sc.nextInt();
            }

            int temp=0; // 임시로 구할 조망권이 있는 한 빌딩의 세대 수
            int view=0; // 조망권이 있는 세대 수 총합

            for(int i=0; i<h;i++){
                if(a[i]!=0){ // 건물이 0층이면 비교할 수 없음
                    if(a[i]>a[i-1]&&a[i]>a[i-2]){
                        if(a[i]>a[i+1]&&a[i]>a[i+2]){ //a[i]가 제일 높아야 조망권 획득 가능
                            //4개 비교
                            int b1,b2,big;
                            if(a[i-1]>=a[i-2]) b1 = a[i-1];
                            else b1 = a[i-2];

                            if(a[i+1]>=a[i+2]) b2 = a[i+1];
                            else b2 = a[i+2];

                            if(b1>b2) big = b1 ;
                            else big = b2;

                            temp = (a[i]-big);
                            view = view + temp;
                        }
                    }
                }

                if(a[i]==0){
                    continue; // 건물이 0층이면 비교할 수 없음
                }
            }
            System.out.println("#"+test_case+" "+view);
        }
    }
}