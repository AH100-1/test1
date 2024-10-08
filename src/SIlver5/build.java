package SIlver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class build {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[][] arr = new int[num][2];
        int[] check = new int[num];


        for (int i = 0; i < num; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(stk.nextToken());
            arr[i][1] = Integer.parseInt(stk.nextToken());
            check[i] = 1;
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++){
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    check[i]++;
                }
            }
            System.out.print(check[i] + " ");
        }

    }
}