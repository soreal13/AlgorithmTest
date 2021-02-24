package programmers.skillset;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class hash_Disguise {

    public int solution(String[][] clothes) {
        return Arrays.stream(clothes)
                .map(c -> c[1])
                .distinct()
                .map(type -> (int) Arrays.stream(clothes).filter(c -> c[1].equals(type)).count())
                .map(c -> c+1)
                .reduce(1, (c, n) -> c * n) -1;
    }

    public int solution2(String[][] clothes) {
        Map<String, Integer> counts = new HashMap<>();

        for(String[] c : clothes) {
            String type = c[1];
            counts.put(type, counts.getOrDefault(type, 0) +1);
        }

        int answer = 1;
        for (Integer c: counts.values()) {
            answer *= c + 1;
        }
        answer -= 1;

        return answer;
    }


}
