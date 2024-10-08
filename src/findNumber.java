import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class findNumber {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] input = new int[Integer.parseInt(br.readLine())];
        StringTokenizer stk1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < input.length; i++) {
                input[i] = Integer.parseInt(stk1.nextToken());
        }

        Arrays.sort(input);

        int find = Integer.parseInt(br.readLine());
        StringTokenizer stk2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < find; i++){
            if (Arrays.binarySearch(input, Integer.parseInt(stk2.nextToken())) >= 0){
                System.out.println(1);
            } else{
                System.out.println(0);
            }
        }
    }
}
