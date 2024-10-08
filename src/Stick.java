import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stick {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String replace = input.replace("()", "*");
        String [] arr = replace.split("");

        int size = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i].equals("(")){
                size++;
            }else if(arr[i].equals("*")){
                sum += size;
            }else{
                size--;
                sum++;
            }
        }
        System.out.print(sum);
    }
}
