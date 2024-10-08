package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Pocketmon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(stk.nextToken());
        int find = Integer.parseInt(stk.nextToken());
        boolean check = false;

        HashMap<String, Integer> h1 = new HashMap<>();
        String [] arr = new String[number + 1];

        for (int i = 1; i <= number; i++){
            String input = br.readLine();
            h1.put(input, i);
            arr[i] = input;
        }

        for (int i = 0; i < find; i++){
            String findInput = br.readLine();
            check = isStringNumber(findInput);

            if (check){
                System.out.println(arr[Integer.parseInt(findInput)]);
            } else {
                System.out.println(h1.get(findInput));
            }
        }
    }
    public static boolean isStringNumber(String s){
        try {
            Double.parseDouble(s);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}



/**
 * 우선 성공하긴 했으나 hashmap을 사용하면 훨씬 더 좋은 효율을 뽑을 수 있기 때문에 이건 패스
 */

//        String [] arr = new String[number];
//
//        for (int i = 0; i < number; i++){
//            arr[i] = br.readLine();
//        }
//
//        for (int i = 0; i < find; i++){
//            String findInput = br.readLine();
//            int loc = IntStream.range(0, arr.length)
//                    .filter(a -> arr[a].equals(findInput))
//                    .findFirst()
//                    .orElse(-1);
//            if (loc >= 0) {
//                System.out.println(loc + 1);
//            } else {
//                System.out.println(arr[Integer.parseInt(findInput) - 1]);
//            }
//        }