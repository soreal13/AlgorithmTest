package programmers.level1;

public class PickTwoPlus {

//    문제 설명
//    정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서
//    만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
//
//    제한사항
//    numbers의 길이는 2 이상 100 이하입니다.
//    numbers의 모든 수는 0 이상 100 이하입니다.

    public static void main(String[] args) {

        int[] test1 = {2, 1, 3, 4, 1};
        int[] test2 = {2, 5, 7, 8, 12};

        int[] answer1 = solution(test1);
        int[] answer2 = solution(test2);

        System.out.println(answer1);
        System.out.println(answer2);

    }

    public static int[] solution(int[] numbers) {
        int[] answer = {};

        return answer;
    }

}
