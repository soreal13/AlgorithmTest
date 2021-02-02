package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class skilltest1 {


//    문제 설명
//    어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
//    예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다.
//    문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
//
//            제한 조건
//    공백은 아무리 밀어도 공백입니다.
//    s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
//    s의 길이는 8000이하입니다.
//            n은 1 이상, 25이하인 자연수입니다.

    public static void main(String[] args) {

        String s1 = "AB";
        String s2 = "a";
        String s3 = "a B z";

        String answer1 = solution(s1, 1);
        String answer2 = solution(s2 ,1);
        String answer3 = solution(s3, 4);

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
    }

    public static String solution(String s, int n) {
        String answer = "";
        String[] alpha = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q" ,"R", "S", "T","U", "V", "W", "X", "Y", "Z"};
        String[] sAlph = { "a", "B", "C", "d", "e", "f" , "g", "h", "i", "j", "k", "l", "m",
                "n","o", "p", "q", "r", "s", "T", "u", "v" , "w", "X", "y", "z"};




        return answer;
    }

}
