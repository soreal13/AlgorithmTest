package programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DescendingOrderString {


//    문제 설명
//    문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
//    s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
//
//            제한 사항
//    str은 길이 1 이상인 문자열입니다.

    public static void main(String[] args) {

        String test = "Zbcdefg";

        String answer = solution1(test);

        System.out.println(answer);

    }

    public static String solution1(String str) {
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }

    public static String solution2(String str) {
        return Stream.of(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }

    public static String solution3(String str) {
        String[] arry = str.split("");
        Arrays.sort(arry,  Collections.reverseOrder());
        StringBuffer sb = new StringBuffer();
        for( String s : arry )
        {
            sb.append(s);
        }
        return sb.toString();
    }

    public static String solution4(String str) {
        char[] ch = str.toCharArray();
        String lower = "";
        String upper = "";

        for(int i = 0; i < ch.length; i++) {
            int chnum = ch[i];

            if(chnum >= 65 && chnum <= 90)
                upper += ch[i];
            else
                lower += ch[i];
        }

        char[] chUpper = upper.toCharArray();
        char[] chLower = lower.toCharArray();
        upper = ""; lower = "";

        Arrays.sort(chUpper);
        Arrays.sort(chLower);

        for(int i = chUpper.length - 1; i >= 0; i--)
            upper += chUpper[i];
        for(int i = chLower.length - 1; i >= 0; i--)
            lower += chLower[i];

        return lower + upper;

    }




}
