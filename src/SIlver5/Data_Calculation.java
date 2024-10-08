package SIlver5;

import java.io.*;
import java.util.StringTokenizer;

public class Data_Calculation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(stk.nextToken());
        int S = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());

        int count = 0,e = 0, s = 0 ,m = 0;

        while (true){
            count++;
            e++;
            s++;
            m++;

            if (e > 15){
                e = 1;
            }
            if (s > 28){
                s = 1;
            }
            if (m > 19){
                m = 1;
            }

            if (e == E && s == S && m == M){
                break;
            }
        }
        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}
