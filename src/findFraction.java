import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class findFraction {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int denominator = 1;
        int numerator = 1;

        while (num != 1){
            if (numerator == 1){
                denominator++;
                num--;
                while (denominator != 1 && num != 1){
                    numerator++;
                    denominator--;
                    num--;
                }
            } else if (denominator == 1){
                numerator++;
                num--;
                while (numerator != 1 && num != 1){
                    denominator++;
                    numerator--;
                    num--;
                }
            }
        }

        System.out.print(numerator + "/" + denominator);
    }
}
