import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RGB_Rate {
    static int [][] dp;
    static int [][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int line = Integer.parseInt(br.readLine());
        arr = new int [line][3];
        dp = new int [line][3];


        for (int i = 0; i < line; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(stk.nextToken());
            arr[i][1] = Integer.parseInt(stk.nextToken());
            arr[i][2] = Integer.parseInt(stk.nextToken());
        }

        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        System.out.println(Math.min(Point_cost( line - 1, 0), Math.min(Point_cost(line - 1, 1), Point_cost(line - 1, 2))));
    }

    static int Point_cost(int n, int color){
        if (dp[n][color] == 0) {
            if (color == 0) {
                dp[n][0] = Math.min(Point_cost(n - 1, 1), Point_cost(n - 1, 2)) + arr[n][0];
            } else if (color == 1) {
                dp[n][1] = Math.min(Point_cost(n - 1, 0), Point_cost(n - 1, 2)) + arr[n][1];
            } else {
                dp[n][2] = Math.min(Point_cost(n - 1, 0), Point_cost(n - 1, 1)) + arr[n][2];
            }
        }
        return dp[n][color];
    }
}
