package boj.step8;

import java.util.Scanner;

public class N2775 {

         public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

         // 아파트를 2차원 배열로 표현
         int[][] apt = new int[15][15]; // 1<=k<=14, 1<=n<=14

         // 살고있는 사람의 수를 이차원 배열(표)에 미리 채워넣는다.
         // 초기 정보 세팅
         for(int i=0; i<15; i++) {
             apt[i][1] = 1; // 각 층의 1호엔 1명이 산다 (i-1의 0호에는 사람이 살지 않으며, i-1의 1호에는 1명이 산다.)
             apt[0][i] = i; // 0층의 i호에는 i명의 사람이 산다. (0~14)
         }

         // 나머지 호수 계산
         for(int i=1; i<15; i++) { // 1층부터 14층까지
             for (int j=2; j<15; j++) { // 2호부터 14호까지
                 apt[i][j] = apt[i][j-1] + apt[i-1][j]; //본인 층수의 전호는 아래층의 전호까지의 합이다. 거기에 본인 아래층의 호를 더하면 본인 호수가 되어야할 숫자가 된다.
             }

         }

         // 입력 값에 대한 계산
         int num = in.nextInt();

         for(int i=1; i<=num; i++) {
             int k = in.nextInt();
             int n = in.nextInt();

             System.out.println(apt[k][n]);

         }
     }
}
