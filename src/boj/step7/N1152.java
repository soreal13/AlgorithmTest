package boj.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1152 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = null;
        try {
            stringTokenizer = new StringTokenizer(br.readLine(), " ", false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(stringTokenizer.countTokens());
    }
}
