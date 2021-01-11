package programmers.level1;

public class PickMiddleChar {


//    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
//    단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//
//    제한사항
//    s는 길이가 1 이상, 100이하인 스트링입니다.

    public static void main(String[] args) {

        String test1 = "abced";
        String test2 = "qwer";

        String answer1 = solution1(test1);
        String answer2 = solution1(test2);

        System.out.println(answer1);
        System.out.println(answer2);

    }

    public static String solution1(String s) {
        String answer = "";

        //짝수 홀수 체크
        int length = s.length();
        System.out.println(length);

        if ((length % 2) == 0) {
            //짝수 일때 중간 2글자 가져가기
            System.out.println((length/2)-1);
            answer = s.substring((length/2)-1,(length/2)+1);
        } else {
            //홀수 일때 중간글자 가져가기
            System.out.println("in");
            answer = s.substring((length/2), (length/2) + 1);
        }

        return answer;
    }
}
