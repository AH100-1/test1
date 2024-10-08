import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int count = 0;
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());

        int [] arr = new int[a];

        for (int i = 0; i < a; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = a - 1; i >= 0; i--){
            while (b - arr[i] >= 0){
                b -= arr[i];
                count++;
            }
        }

        System.out.println(count);
    }
}
