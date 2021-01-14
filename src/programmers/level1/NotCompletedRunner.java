package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NotCompletedRunner {


//    문제 설명
//    수많은 마라톤 선수들이 마라톤에 참여하였습니다.
//    단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
//
//    마라톤에 참여한 선수들의 이름이 담긴 배열 participant와
//    완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
//    완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
//
//    제한사항
//    마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
//    completion의 길이는 participant의 길이보다 1 작습니다.
//    참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
//    참가자 중에는 동명이인이 있을 수 있습니다.


    public static void main(String[] args) {

        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};

        String answer = solution(participant1, completion1);

        System.out.println(answer);

    }

    public static String solution(String[] participant, String[] completion) {

        // 정렬한다
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 대조한다
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[participant.length-1];

    }

    public static String hashSolution(String[] participant, String[] completion)
    {
        HashMap<String, Integer> map = new HashMap<>();

        for (String name :
                completion) {
            map.put(name, map.getOrDefault(name, 0) + 1);
            // getOrDefault() : 찾는 키가 존재하면 해당 키의 값을 반환하고 없으면 기본값을 반환
        }

        for (String name :
                participant) {
            map.put(name, map.getOrDefault(name, 0) - 1);

            if (map.get(name) < 0)
                return name;
        }

        return "";
    }


    public static String faildsolution(String[] participant, String[] completion) {
        String answer = "";
        //List<String> comlist= Arrays.asList(participant);
        List<String> parlist= new ArrayList<String>(Arrays.asList(completion));

        //참가자를 완주자에서 하나씩 빼고 만약에 그 값이 없으면 answer 배열에 넣는다.

        for (int i=0; i<completion.length; i++) {
            String tmp=completion[i];

            for(int j=0; j<participant.length; j++){
                if(participant[j].equals(tmp)) {
                    participant[j]="";
                    break;
                }
            }
        }

        for (String s : participant){
            answer=answer+s;
        }

        return answer;

    }

}
