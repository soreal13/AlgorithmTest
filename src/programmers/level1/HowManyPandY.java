package programmers.level1;

import java.util.*;

public class HowManyPandY {

//    문제 설명

//    대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
//    s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
//    'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
//    단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
//
//    예를 들어 s가 pPoooyY면 true를 return하고 Pyy라면 false를 return합니다.
//
//            제한사항
//    문자열 s의 길이 : 50 이하의 자연수
//    문자열 s는 알파벳으로만 이루어져 있습니다.

    public static void main(String[] args) {

        String test1 = "pPoooyY";
        String test2 = "Pyy";

        Boolean answer1 = HowManyPandY.solution(test1);
        Boolean answer2 = HowManyPandY.solution(test2);

        System.out.println(answer1);
        System.out.println(answer2);

    }


    static boolean solution(String s) {
        boolean answer = true;

        // 일단 모두 소문자로 변환시킬때 그냥 toLowerCase는 지나가는 함수임.
        // 반드시 다시 변수에 대입시켜줘야 함.
        s = s.toLowerCase();
        System.out.println(s);

        // 배열에 넣기
        String []py = new String[s.length()];

        for(int i=0; i<s.length(); i++) {
            py[i] = (s.substring(i, i+1));
        }

        int pcount = 0;
        int ycount = 0;

        //개수 각각 더하기
        for (int i=0; i< py.length; i++) {
            if (py[i].equals("p")) {
                pcount++;
            }
            if (py[i].equals("y")) {
                ycount++;
            }
        }

        // 둘 다 없으면 참이라고 리턴
        if (pcount == 0 && ycount == 0) {
            return true;
        }

        if (pcount == ycount) {
            return true;
        } else {
            return false;
        }
    }

}
