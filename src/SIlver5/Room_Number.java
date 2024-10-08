package SIlver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Room_Number {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        int [] arr = new int[10];
        Arrays.fill(arr, 0);

        for (int i = 0; i < number.length(); i++){
            arr[Integer.parseInt(String.valueOf(number.charAt(i)))]++;
        }
        arr[6] = arr[9] = (arr[6] + arr[9])/2 + (arr[6] + arr[9])%2;

        Arrays.sort(arr);

        System.out.println(arr[9]);
    }
}
