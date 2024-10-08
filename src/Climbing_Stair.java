import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Climbing_Stair {
    static Integer [] dp;
    static int [] stair;


    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        stair = new int[num + 1];
        dp = new Integer[num + 1];

        for (int i = 1; i <= num; i++){
            stair [i] = Integer.parseInt(br.readLine());
        }
        dp[0] = stair[0];
        dp[1] = stair[1];

        if (num >= 2){
            dp[2] = stair[2] + stair[1];
        }

        System.out.println(func(num));
    }

    static int func(int N){
        if (dp[N] == null){
            dp[N] = Math.max(func(N - 2), func(N - 3) + stair[N - 1]) + stair[N];
        }
        return dp[N];
    }
}
