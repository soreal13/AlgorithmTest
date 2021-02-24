package programmers.skillset;

import java.util.LinkedList;
import java.util.Queue;

public class greedy_wireless_statation {


    public static void main(String[] args) {
        int n1 = 11;
        int[]stations1 = {4,11};
        int w1 = 1;
        int answer1 = 3;

        int n2 = 16;
        int[]station2 = {9};
        int w2 = 2;
        int answer2 = 3;

        int realAnswer = solution(n1, stations1, w1);
        int realAnswer2 = solution(n2, station2, w2);

        System.out.println(realAnswer);
        System.out.println(realAnswer2);

    }


    public static int solution(int n, int[] stations, int w) {
        int answer = 0;

        // greedy 탐욕법
        Queue<Integer> sq = new LinkedList<>();
        for(int s: stations) sq.offer(s);

        int position = 1;
        while(position <= n) {
            if(!sq.isEmpty() && sq.peek() - w <= position ) {
                position = sq.poll() + w + 1;
            } else {
                answer += 1; // 기지국 하나 설치
                position += w*2 + 1; //기지국 범위만큼 이동
            }
        }

        return answer;
    }

    public static int solution2(int n, int[] stations, int w) {
        int answer = 0;
        int si=0;
        int position = 1;
        while(position <= n) {
            if(si < stations.length && stations[si] - w <= position ) {
                position = stations[si] + w + 1;
                si += 1;
            } else {
                answer += 1; // 기지국 하나 설치
                position += w*2 + 1; //기지국 범위만큼 이동
            }
        }

        return answer;
    }



}









