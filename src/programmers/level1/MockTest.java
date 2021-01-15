package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class MockTest {

// 완전 탐색
//    문제 설명
//    수포자는 수학을 포기한 사람의 준말입니다.
//    수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
//    수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
//
//            1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//            2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//            3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//
//   1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
//   가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
//
//    제한 조건
//    시험은 최대 10,000 문제로 구성되어있습니다.
//    문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
//    가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.


    public static void main(String[] args) {

        int[] answerTest1 = {1,2,3,4,5};
        int[] answerTest2 = {1,2,3};

        int[] answer = solution(answerTest1);

        for(int i=0; i<answer.length; i++) {
            System.out.println(answer[i]);
        }

    }


    public static int[] solution(int[] answers) {

        int[] stu1 = {1,2,3,4,5};
        int[] stu2 = {2,1,2,3,2,4,2,5};
        int[] stu3 = {3,3,1,1,2,2,4,4,5,5};

        int a = 0;
        int b = 0;
        int c = 0;

        // 찍는 방식이 5, 8, 10번으로 각각 반복 된다.
        // 따라서 반복되는 숫자를 나눈 값의 나머지가 대조하면 되는 답이다.

        for(int i=0; i < answers.length; i++) {
            if ( answers[i] == stu1[i % 5] ) {
                a++;
            }
            if( answers[i] == stu2[i % 8] ) {
                b++;
            }
            if ( answers[i] == stu3[i % 10] ) {
                c++;
            }
        }

        // 셋중 가장 큰 값 고르기
        int max = Math.max(a, Math.max(b,c));

        List<Integer> list = new ArrayList<>();
        if ( max == a ) {
            list.add(1);
        }
        if ( max == b ) {
            list.add(2);
        }
        if ( max == c ) {
            list.add(3);
        }

        int[] answer = new int[list.size()];

        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

}
