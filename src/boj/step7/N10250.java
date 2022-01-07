package boj.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10250 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 0;
        try {
            T = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = null;
            try {
                st = new StringTokenizer(br.readLine(), " ");
            } catch (IOException e) {
                e.printStackTrace();
            }
            int H = Integer.parseInt(st.nextToken());
            st.nextToken();
            int N = Integer.parseInt(st.nextToken());

            String result = (N%H == 0) ? String.valueOf(H*100 + (int)Math.floor((N/H))) : String.valueOf((N%H)*100 + (int)Math.floor((N/H)+1));
            sb.append(result).append('\n');
        }
        System.out.print(sb);
    }

}

