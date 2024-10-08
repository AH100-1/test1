package SIlver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Filp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int count = 0;

        for (int i = 0; i < line.length() - 1; i++){
            if (line.charAt(i) != line.charAt(i + 1)){
                count++;
            }
        }

        System.out.println(count / 2 + count % 2);
    }
}
