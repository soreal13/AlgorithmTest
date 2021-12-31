package boj.step6;

import java.util.*;

public class N15596 {

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 111, 5, 6, 7}));
    }

    public static long sum(int[] a) {
        //*long abc = 0;
        //     for (int t : a) {
        //         abc+=t;
        //     }
        //     return abc;*/
        return Arrays.stream(a).filter(value -> 0<=value && value<=3000000).mapToLong(i->i).sum();
    }
}
