package SIlver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreditandGrade {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int creditSum = 0;
        double result = 0;

        for (int i = 0; i < 20; i++){
            String [] input = br.readLine().split(" ");
            Double credit = Double.parseDouble(input[1]);
            switch (input[2]){
                case "A+":
                    result += credit * 4.5;
                    creditSum += credit;
                    break;
                case "A0":
                    result += credit * 4;
                    creditSum += credit;
                    break;
                case "B+":
                    result += credit * 3.5;
                    creditSum += credit;
                    break;
                case "B0":
                    result += credit * 3;
                    creditSum += credit;
                    break;
                case "C+":
                    result += credit * 2.5;
                    creditSum += credit;
                    break;
                case "C0":
                    result += credit * 2;
                    creditSum += credit;
                    break;
                case "D+":
                    result += credit * 1.5;
                    creditSum += credit;
                    break;
                case "D0":
                    result += credit * 1;
                    creditSum += credit;
                    break;
                case "F":
                    result += credit * 0;
                    creditSum += credit;
                    break;
                case "P":
                    break;
            }
        }
        System.out.printf("%.6f", result/creditSum);
    }
}
