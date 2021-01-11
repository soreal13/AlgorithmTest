package programmers.level1;


public class BasicString {


//    문제 설명
//    문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
//    예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
//
//    제한 사항
//    s는 길이 1 이상, 길이 8 이하인 문자열입니다.

    public static void main(String[] args) {

        String test1 = "a234";
        String test2 = "1234";

        boolean answer1 = solution(test1);
        boolean answer2 = solution(test2);

        System.out.println(answer1);
        System.out.println(answer2);

    }

    public static boolean solution(String s) {
        boolean answer = true;

        //문자열 길이 체크
        if(s.length() != 4 && s.length() != 6) {
            System.out.println("길이체크");
            return false;
        }

        //문자변환
        try {
            int pre = Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            System.out.println("문자변환");
            return false;
        }
    }


}
