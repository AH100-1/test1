import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] input = br.readLine().split("");
        int line = Integer.parseInt(br.readLine());

        String [] stack1 = new String[input.length];
        String [] stack2 = new String[input.length];
        int size1 = 0;
        int size2 = 0;


        if (input.length == 1){
            size1 = 1;
        }else {
            size1 = 1;
            size2 = 1;
        }

        stack1[0] = input[0];
        stack2[0] = input[input.length - 1];

        for (int i = input.length - 2; i > 0; i--){
            stack2[size2] = input[i];
            size2++;
        }

        for (int i = 0; i < line; i++){
            String order = br.readLine();

            if (order.equals("move right") && size2 != 1){
                stack1[size1] = stack2[size2 - 1];
                stack2[size2 - 1] = null;
                size1++;
                size2--;
            }else if (order.equals("move left") && size1 != 1){
                stack2[size2] = stack1[size1 - 1];
                stack1[size1 - 1] = null;
                size2++;
                size1--;
            }else if (order.equals("tear right") && size2 != 1){
                stack2[size2 - 1] = null;
                size2--;
            }else if (order.equals("tear left") && size1 != 1){
                stack1[size1 - 1] = null;
                size1--;
            }
        }
        System.out.print(stack1[size1 - 1] + " " + stack2[size2 - 1]);
    }
}