package SIlver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bruteForce {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int count = 1;
        int check = 666;

        while (num != count){
            check++;
            if (String.valueOf(check).contains("666")){
                count++;
            }
        }
        System.out.println(check);
    }
}
