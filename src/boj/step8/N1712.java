package boj.step8;

import java.util.Scanner;

public class N1712 {
         public static void main(String[] args) {

         Scanner in = new Scanner(System.in);

         // 입력 변수를 받아준다.
         int a = in.nextInt();
         int b = in.nextInt();
         int c = in.nextInt();

         // 판매가가 원가와 같거나 작으면 영원히 고정비용을 회수 못하므로 손익분기점을 넘을 수 없다.
         if (c <= b) {
             System.out.println("-1");
         } else {
             // 초기 고정비용(a)과 개당 마진(c-b)이 같아지는 시점에서 손익분기점 제품 개수가 결정된다.
             // 이윤이 나는 시점은 a = (c-b) 에서 +1을 한 숫자이다.
             System.out.println((a/(c-b))+1);
         }

     }
}
