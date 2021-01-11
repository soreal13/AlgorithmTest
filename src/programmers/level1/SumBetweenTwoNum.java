package programmers.level1;

public class SumBetweenTwoNum {

//    문제 설명
//    두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
//    예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
//
//    제한 조건
//    a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
//    a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
//    a와 b의 대소관계는 정해져있지 않습니다.

    public static void main(String[] args) {

        int test1_1 = 3;
        int test1_2 = 5;

        int test2_1 = 3;
        int test2_2 = 3;

        int test3_1 = 5;
        int test3_2 = 3;

        long answer1 = solution(test1_1, test1_2);
        long answer2 = solution(test2_1, test2_2);
        long answer3 = solution(test3_1, test3_2);

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);

    }


    public static long solution(int a, int b) {

        long answer = 0;

        // 두 수 대소비교
        int check = a - b;

        // 같으면 둘 중 하나 리턴
        if (check == 0 ) {
            return a;
        }

        // 다르면 작은 것 부터 큰것 까지 더해서 리턴
        if(a > b) {
            for (int i=b; i<=a; i++) {
                answer += i;
            }
            return answer;
        } else {
            for (int i=a; i<=b; i++) {
                answer += i;
            }
            return answer;
        }
    }

}
