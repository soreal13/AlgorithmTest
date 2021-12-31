package boj.step6;

 public class N4673 {
     public static void main(String[] args) {
         int index = 10001;
         boolean[] nums = new boolean[index];

         for(int i=1; i<=nums.length; i++) {
             int dn = getDn(i);
             if (dn <= 10000) {
                 nums[dn] = true; // selfnumber가 아니면 true
             }
         }

         for(int i=1; i<nums.length; i++) {
             if(!nums[i]) {
                 System.out.println(i);
             }
         }
     }

     static int getDn(int n) {
         int self = n;

         while(n > 0) {
             self += (n % 10); // 일의 자리수에 있는 수를 self에 누적
             n /= 10; // 자리수 하나씩 줄이기
         }

         return self;
     }
 }