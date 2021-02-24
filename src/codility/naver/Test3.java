package codility.naver;

public class Test3 {

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {
        public int solution(int[] A) {
            int maxInteger = 0;

            for(int i=0; i<A.length; i++) {
                for(int j=0; j<A.length; j++) {
                    if( A[i] * -1 == A[j] ) {
                        if(A[j] < 0) {
                            A[j] = A[j] * -1;
                        }
                        if( maxInteger == 0 ) {
                            maxInteger = A[j];
                        } else {
                            if( A[j] > maxInteger) {
                                maxInteger = A[j];
                            }
                        }
                    }
                }
                if( maxInteger == 0 ) {
                    break;
                }
            }

            return maxInteger;
        }
    }

}
