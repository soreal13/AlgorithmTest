package programmers.skillset;

import java.util.LinkedList;
import java.util.Queue;

public class DFS_rightBracket {


    class P {
        int open, close;
        P (int open, int close) {
            this.open = open;
            this.close = close;
        }
    }

    public int solution(int n) {
        int answer = 0;

        Queue<P> stack = new LinkedList<>();
        stack.offer(new P(0,0));
        while(!stack.isEmpty()) {
            P p = ((LinkedList<P>) stack).pop();

            if(p.open > n) continue;
            if(p.open < p.close) continue;
            if(p.open + p.close == 2*n) {
                answer++;
                continue;
            }

            ((LinkedList<P>) stack).push(new P(p.open+1, p.close));
            ((LinkedList<P>) stack).push(new P(p.open, p.close+1));
        }
        return answer;
    }



}
