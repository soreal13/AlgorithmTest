package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SkillTree {


//    문제 설명
//    선행 스킬이란 어떤 스킬을 배우기 전에 먼저 배워야 하는 스킬을 뜻합니다.
//
//    예를 들어 선행 스킬 순서가 스파크 → 라이트닝 볼트 → 썬더일때,
//    썬더를 배우려면 먼저 라이트닝 볼트를 배워야 하고, 라이트닝 볼트를 배우려면 먼저 스파크를 배워야 합니다.
//
//    위 순서에 없는 다른 스킬(힐링 등)은 순서에 상관없이 배울 수 있습니다.
//    따라서 스파크 → 힐링 → 라이트닝 볼트 → 썬더와 같은 스킬트리는 가능하지만,
//    썬더 → 스파크나 라이트닝 볼트 → 스파크 → 힐링 → 썬더와   같은 스킬트리는 불가능합니다.
//
//    선행 스킬 순서 skill과 유저들이 만든 스킬트리1를 담은 배열 skill_trees가 매개변수로 주어질 때,
//    가능한 스킬트리 개수를 return 하는 solution 함수를 작성해주세요.
//
//    제한 조건
//    스킬은 알파벳 대문자로 표기하며, 모든 문자열은 알파벳 대문자로만 이루어져 있습니다.
//    스킬 순서와 스킬트리는 문자열로 표기합니다.
//    예를 들어, C → B → D 라면 CBD로 표기합니다
//    선행 스킬 순서 skill의 길이는 1 이상 26 이하이며, 스킬은 중복해 주어지지 않습니다.
//    skill_trees는 길이 1 이상 20 이하인 배열입니다.
//    skill_trees의 원소는 스킬을 나타내는 문자열입니다.
//    skill_trees의 원소는 길이가 2 이상 26 이하인 문자열이며, 스킬이 중복해 주어지지 않습니다.
//


    public static void main(String[] args) {

        String testSkill1 = "CBD";
        String[] testSkill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        int answer = solution(testSkill1, testSkill_trees);

        System.out.println(answer);

    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        //[^skill]를 사용하여 skill문자열을 제외한 나머지 문자 모두 제거
        // indexof로 순서를 무시하지 않았는지 확인
        // 무시했다면 제거 마지막으로 길이 반환

        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        Iterator<String> it = skillTrees.iterator();


        // [^xy] not 을 표현하며  x 및 y 를 제외한 문자를 의미한다.
        //출처: https://hamait.tistory.com/342 [HAMA 블로그]
        while(it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
            }
        }
        answer = skillTrees.size();
        return answer;
    }

    public static int solution2(String skill, String[] skill_trees) {
        int answer = 0;
        for (String skillTree : skill_trees) {
            int learningIdx = 0;
            boolean isAble = true;
            for (char curSkill : skillTree.toCharArray()) {
                int skillIdx = skill.indexOf(curSkill);
                if (skillIdx == -1)
                    continue;
                else if (skillIdx == learningIdx)
                    learningIdx++;
                else {
                    isAble = false;
                    break;
                }
            }
            if (isAble)
                answer++;
        }
        return answer;
    }

    public static int failedsolution(String skill, String[] skill_trees) {
        int answer = 0;

        // 스킬 트리 세팅
        ArrayList<String> skillOrder = new ArrayList<>();
        for (int i=0; i<skill.length(); i++) {
            skillOrder.add(skill.substring(i, i+1));
        }

        ArrayList<String> userOrder = new ArrayList<>();
        // 있는 스킬을 뽑아냄
        for (int i=0; i<skill_trees.length; i++) {
            for (int j=0; j<skill_trees[i].length(); j++) {
                if ( skillOrder.contains(skill_trees[i].substring(j, j+1)) ) {
                       userOrder.add(skill_trees[i].substring(j, j+1));
                }
            }
            System.out.println("skillOrder" + skillOrder.toString());
            System.out.println("userOrder" + i + " : "+ userOrder.toString());
            if ( skillOrder.toString().equals(userOrder.toString()) ) {
                answer += 1;
                System.out.println("in");
                System.out.println("answer=" +answer);
            }
            userOrder.clear();
        }


        // Comparator?? https://codevang.tistory.com/288

        return answer;
    }

}
