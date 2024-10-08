package SIlver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rock_Game {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        if (number % 2 == 0){
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
}
