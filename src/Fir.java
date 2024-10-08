import java.io.*;

public class Fir {
    static int [][] arr;
    static boolean [] chk;
    static int count = 0;
    static int computer, union;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computer = Integer.parseInt(br.readLine());
        union = Integer.parseInt(br.readLine());

        arr = new int[computer + 1][computer + 1];
        chk = new boolean[computer + 1];

        for(int i = 0; i < union; i++){
            String [] input = br.readLine().split(" ");
            int union1 = Integer.parseInt(input[0]);
            int union2 = Integer.parseInt(input[1]);

            arr[union1][union2] = arr[union2][union1] = 1;
        }

        dfs(1);
        System.out.println(count - 1);
    }

    public static void dfs(int start){
        if(!chk[start]) {
            chk[start] = true;
            count++;
            for(int i = 0; i <= computer; i++) {
                if (arr[start][i] == 1 && !chk[i]){
                    dfs(i);
                }
            }
        }
    }
}
