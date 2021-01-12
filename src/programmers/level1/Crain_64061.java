package programmers.level1;


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
        int result = solution2(board, moves);
        System.out.println(result);

    }


    public static int solution2(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> box = new Stack<>();
        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) { // 0이 아닐 때, 즉 빈 곳이 아닐 때
                    if (box.isEmpty()) { // 박스가 비어있으면 인형을 넣음
                        box.push(board[j][move - 1]);
                        board[j][move - 1] = 0;
                        break;
                    }
                    if (board[j][move - 1] == box.peek()) { // 박스의 꼭대기와 같으면 없애버리고 result 2개 증가
                        box.pop();
                        answer += 2;
                    } else {
                        box.push(board[j][move - 1]); // 박스의 꼭대기와 다르면 인형 넣기

                    }
                    board[j][move - 1] = 0; // 인형 뽑았으면 없애기.
                    break;
                }
            }
        }
        return answer;
    }

    public static int failedsolution1(int[][] board, int[] moves) {
        int answer = 0;

        // 1 각 인형 힙에 넣어주기
//        Stack<Integer> crain1 = new Stack<Integer>();
//        for(int i=0; i<board[0].length; i++) {
//            if(board[0][i] != 0) {
//                crain1.push(board[0][i]);
//            }
//        }
//        Stack<Integer> crain2 = new Stack<Integer>();
//        for(int i=0; i<board[1].length; i++) {
//            if(board[1][i] != 0) {
//                crain2.push(board[1][i]);
//            }
//        }
//        Stack<Integer> crain3 = new Stack<Integer>();
//        for(int i=0; i<board[2].length; i++) {
//            if(board[2][i] != 0) {
//                crain3.push(board[2][i]);
//            }
//        }
//        Stack<Integer> crain4 = new Stack<Integer>();
//        for(int i=0; i<board[3].length; i++) {
//            if(board[3][i] != 0) {
//                crain4.push(board[3][i]);
//            }
//        }
//        Stack<Integer> crain5 = new Stack<Integer>();
//        for(int i=0; i<board[4].length; i++) {
//            if(board[4][i] != 0) {
//                crain5.push(board[4][i]);
//            }
//        }
        // 이까진 완료


        // 2.바구니에 인형쌓기 위해 인형 집기
        // 2-2 인형 넣는 바구니 배열 선언

        Stack<Integer> box = new Stack<>();
        for (int i : moves) {
            for (int j=0; j<board.length; j++) { //board.length = 5
                if (board[j][i-1] != 0) {
//                    System.out.println("j:"+j+" i:"+i+" board[j][i-1]:"+board[j][i-1]);
                    if (box.empty()) { // 박스 비었을 때
                        box.push(board[j][i-1]);
                        break;
                    } else {
                        if (box.peek() == board[j][i-1]) { // 인형 터뜨리기
                            box.pop();
                            answer += 2;
                        } else {
                            box.push(board[j][i-1]); // 인형 넣기
                        }
                    }
                    board[j][i-1] = 0 ; // 뽑은 인형 비우기
                    break; // 빠져나옴
                }

            }
        }

        return answer;
    }



}