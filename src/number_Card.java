import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class number_Card {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
        int [] arr = new int[input];

        for (int i = 0; i < input; i++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        Arrays.sort(arr);

        int find_num = Integer.parseInt(br.readLine());
        StringTokenizer stk2 = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < find_num; i++){
            int check = Integer.parseInt(stk2.nextToken());
            bw.write(findEndValue(arr, check) - findStartValue(arr, check) +  " ");
        }
        bw.flush();
        bw.close();
    }

    public static int findStartValue(int [] arr, int value){
        int start = 0;
        int end = arr.length;

        while (start < end){
            int center = (start + end) / 2;
            if (value <= arr[center]){
                end = center;
            }else{
                start = center + 1;
            }
        }

        return start;
    }

    public static int findEndValue(int [] arr, int value){
        int start = 0;
        int end = arr.length;

        while (start < end){
            int center = (start + end) / 2;
            if (value < arr[center]){
                end = center;
            } else {
                start = center + 1;
            }
        }
        return start;
    }
}
