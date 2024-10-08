package SIlver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class age_Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String [][] arr = new String [num][2];

        for (int i = 0; i < num; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            arr[i][0] = stk.nextToken();
            arr[i][1] = stk.nextToken();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (String [] age: arr){
            System.out.println(age[0] + " " + age[1]);
        }
    }
}