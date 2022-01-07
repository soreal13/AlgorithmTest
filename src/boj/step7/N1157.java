package boj.step7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class N1157 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.next();

        Map<String, Integer> map = new HashMap<>();

        for(String i : str.split("")) {
            if(map.containsKey(i.toUpperCase())) {
                map.put(i.toUpperCase(), map.get(i.toUpperCase()) + 1);
            } else {
                map.put(i.toUpperCase(), 1);
            }
        }

        Map<String, Object> maxCountMap = new HashMap<>();
        maxCountMap.put("key", "");
        maxCountMap.put("count", 0);
        maxCountMap.put("equls", false);

        for( String key : map.keySet() ) {
            if ( (int) maxCountMap.get("count") < map.get(key) ) {
                maxCountMap.put("key", key);
                maxCountMap.put("count", map.get(key));
                maxCountMap.put("equls", false);
            } else if ( (int) maxCountMap.get("count") == map.get(key) ) {
                maxCountMap.put("equls", true);
            } else {
                if ( maxCountMap.isEmpty() ) {
                    maxCountMap.put("key", key);
                    maxCountMap.put("count", map.get(key));
                    maxCountMap.put("equls", false);
                }
            }
        }

        System.out.println( (boolean) maxCountMap.get("equls") ? "?" : maxCountMap.get("key"));
    }
}
