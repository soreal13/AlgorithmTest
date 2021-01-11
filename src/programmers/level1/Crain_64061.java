package programmers.level1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class Crain_64061 {

    public static void main(String[] args) {

        // 문제 제한사항
        /*
            [제한사항]
            board 배열은 2차원 배열로 크기는 5 x 5 이상 30 x 30 이하입니다.
            board의 각 칸에는 0 이상 100 이하인 정수가 담겨있습니다.
            0은 빈 칸을 나타냅니다.
            1 ~ 100의 각 숫자는 각기 다른 인형의 모양을 의미하며 같은 숫자는 같은 모양의 인형을 나타냅니다.
            moves 배열의 크기는 1 이상 1,000 이하입니다.
            moves 배열 각 원소들의 값은 1 이상이며 board 배열의 가로 크기 이하인 자연수입니다.
         */

        // 입력값
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};


        // 기대값 4
        int result = solution(board, moves);
        System.out.println(result);

    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int j=0; j<board.length; j++) {
                if (board[j][move-1] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(board[j][move-1]);
                        board[j][move-1] = 0;
                        break;
                    }
                    if(board[j][move-1] == stack.peek()) {
                        stack.pop();
                        answer += 2;

                    }
                }
            }
        }



        return answer;
    }
    public static int failedsolution(int[][] board, int[] moves) {
        int answer = 0;

        // 1 각 인형 힙에 넣어주기

        Stack<Integer> crain1 = new Stack<Integer>();
        for(int i=0; i<board[0].length; i++) {
            if(board[0][i] != 0) {
                crain1.push(board[0][i]);
            }
        }
        Stack<Integer> crain2 = new Stack<Integer>();
        for(int i=0; i<board[1].length; i++) {
            if(board[1][i] != 0) {
                crain2.push(board[1][i]);
            }
        }
        Stack<Integer> crain3 = new Stack<Integer>();
        for(int i=0; i<board[2].length; i++) {
            if(board[2][i] != 0) {
                crain3.push(board[2][i]);
            }
        }
        Stack<Integer> crain4 = new Stack<Integer>();
        for(int i=0; i<board[3].length; i++) {
            if(board[3][i] != 0) {
                crain4.push(board[3][i]);
            }
        }
        Stack<Integer> crain5 = new Stack<Integer>();
        for(int i=0; i<board[4].length; i++) {
            if(board[4][i] != 0) {
                crain5.push(board[4][i]);
            }
        }
        // 이까진 완료


        // 2.바구니에 인형쌓기 위해 인형 집기
        // 2-2 인형 넣는 바구니 배열 선언
        ArrayList<Integer> box = new ArrayList<>();
        int preNum = 0;
        // 2-3 인형 집기 각 줄에서 마지막꺼
        for(int i=0; i<moves.length; i++) {
            if (preNum != moves[i]) {
                System.out.println(preNum);
                System.out.println(box.toString());
                switch(moves[i]) {
                    case 1:
                        if (!crain1.empty()) {
                            int s = crain1.pop();
                            box.add(s);
                            preNum = s;
                        }
                        break;
                    case 2:
                        if (!crain2.empty()) {
                            int s = crain2.pop();
                            box.add(s);
                            preNum = s;
                        }
                        break;
                    case 3:
                        if (!crain3.empty()) {
                            int s = crain3.pop();
                            box.add(s);
                            preNum = s;
                        }
                        break;
                    case 4:
                        if (!crain4.empty()) {
                            int s = crain4.pop();
                            box.add(s);
                            preNum = s;
                        }
                        break;
                    case 5:
                        if (!crain5.empty()) {
                            int s = crain5.pop();
                            box.add(s);
                            preNum = s;
                        }
                        break;
                }
            }
        }
        System.out.println(box.toString());

        // 3. 마지막 중복 제거해주기
        for (int i=1; i<box.size(); i++) {
            if( box.get(i-1) == box.get(i) ) {
                box.remove(i-1);
                System.out.println(box.toString());
            }
        }

        answer = box.size();

    return answer;
    }



}