package Gold5;

import java.io.*;
import java.util.Arrays;

public class AC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());

        for(int i = 0; i < line; i++){
            String[] order = br.readLine().split("");
            String [] result = new String[Integer.parseInt(br.readLine())];
            String [] arr = br.readLine().split(
                    ",");


            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < arr.length; j++){
                sb.append(arr[j]);
            }

            sb.deleteCharAt(0);
            sb.deleteCharAt(sb.length() - 1);

            for (int j = 0; j < order.length; j++){
                switch (order[j]){
                    case "R":
                        sb.reverse();
                        break;
                    case "D":
                        if(!sb.isEmpty()){
                            sb.deleteCharAt(0);
                        } else {
                            sb.append("error");
                        }
                        break;
                }
            }

            System.out.println(Arrays.toString(result));
        }
    }
    public class dfs(){

    }
}
