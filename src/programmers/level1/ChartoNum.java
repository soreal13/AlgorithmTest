package programmers.level1;

public class ChartoNum {

    public static void main(String[] args) {
        String test = "-1234";
        int answer = solution(test);
        System.out.println(answer);


    }

    public static int solution(String s) {
        int answer = 0;

        // 첫번째 인덱스 부호 확인
        if ( s.contains("-") || s.contains("+") ) {
            // 부호 있을 시 나머지 숫자 변환 후 부호 처리
            if( s.substring(0,1).equals("+") ) {
                // 양수일 때
                answer = Integer.parseInt(s.substring(1));
            } else {
                // 음수일 때
                answer = Integer.parseInt(s.substring(1)) * -1;
            }

        } else {
            // 부호 없을 시 숫자로
            answer = Integer.parseInt(s);
        }

        return answer;
    }
}
