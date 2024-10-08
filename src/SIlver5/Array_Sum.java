package SIlver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array_Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(stk.nextToken());
        int col = Integer.parseInt(stk.nextToken());
        int i,j,x,y;


        int [][] arr = new int[row + 1][col + 1];

        for (int a = 1; a <= row; a++){
            StringTokenizer stkNum = new StringTokenizer(br.readLine());
            for (int b = 1; b <= col; b++){
                arr[a][b] = Integer.parseInt(stkNum.nextToken());
            }
        }

        int line = Integer.parseInt(br.readLine());

        for (int a = 0; a < line; a++){
            int result = 0;

            StringTokenizer stkfind = new StringTokenizer(br.readLine());

            i = Integer.parseInt(stkfind.nextToken());
            j = Integer.parseInt(stkfind.nextToken());
            x = Integer.parseInt(stkfind.nextToken());
            y = Integer.parseInt(stkfind.nextToken());

            for (int b = i; b <= x; b++){
                for (int c = j; c <= y; c++){
                    result += arr[b][c];
                }
            }

            System.out.println(result);
        }
    }
}
