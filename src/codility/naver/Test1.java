package codility.naver;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Test1 {

        public static int[] solution(String[] S) {
            int[] B = new int[3];
            int wordPosition = -1;

            for(int i=0; i<S.length; i++) {
                String[] regArr = S[i].split("");
                for(int j=0; j<S.length; j++) {
                    if ( !S[i].equals(S[j]) ) {
                        String[] strArr = S[j].split("");
                        for(int k=0; k<strArr.length; k++) {
                            if(regArr[k].equals( strArr[k]) ) {
                                B[2] = k;
                                wordPosition = k;
                            }
                        }
                    }
                    if(wordPosition != -1) {
                        B[0] = i;
                        B[1] = j;
                        break;
                    }
                }
                if(wordPosition != -1) {

                    break;
                }
            }

            return B;
        }

}
