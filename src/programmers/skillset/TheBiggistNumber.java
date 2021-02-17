package programmers.skillset;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TheBiggistNumber {


    public static void main(String[] args) {

        int[] numbers1 = {6, 10, 2};
        int[] numbers2 = {3, 30, 34, 5, 9};

        TheBiggistNumber tbn = new TheBiggistNumber();

        System.out.println(tbn.solution(numbers1));
        System.out.println(tbn.solution(numbers2));

    }

    public String solution(int[] numbers) {

        String [] strNums = new String[numbers.length];
        for (int i=0; i< numbers.length; i++) {
            strNums[i] = "" + numbers[i];
        }

        for (int i=0; i< strNums.length-1; i++) {
            for(int j=0; j< strNums.length; j++) {
                String s1 = strNums[i];
                String s2 = strNums[j];
                if((s1+s2).compareTo(s2+s1) < 0) {
                    strNums[i] = strNums[j];
                    strNums[j] = s1;
                }
            }
        }

        String answer = "";
        for (String s : strNums) {
            answer += s;
        }

        return answer;
    }


    public String solution2(int[] numbers) {

        String[] strNums = new String[numbers.length];
        for (int i=0; i<numbers.length; i++) {
            strNums[i] = "" + numbers[i];
        }

        Arrays.sort(strNums, (s1, s2) -> (s2+s1).compareTo(s1+s2));

        String answer = "";
        for (String s : strNums) {
            answer += s;
        }

        if(answer.charAt(0) == '0') {
            return "0";
        }
        return answer;
    }

    public String solution3(int[] numbers) {
        String answer = IntStream.of(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1,s2) -> (s2+s1).compareTo(s1+s2))
                .collect(Collectors.joining());

        if(answer.startsWith("0")) {
            return "0";
        }
        return answer;
    }

}
