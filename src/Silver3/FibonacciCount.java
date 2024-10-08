package Silver3;

import java.io.*;

public class FibonacciCount {
    static Integer[][] arr = new Integer[41][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int line = Integer.parseInt(br.readLine());


        arr[0][0] = 1;
        arr[1][0] = 0;
        arr[0][1] = 0;
        arr[1][1] = 1;

        for (int i = 0; i < line; i++){
            int find = Integer.parseInt(br.readLine());
            fibonacci(find);
            bw.write(arr[find][0] + " " + arr[find][1] + "\n");
            bw.flush();
        }


    }
    static Integer[] fibonacci(int input){
        if (arr[input][0] == null || arr[input][1] == null){
            arr[input][0] = fibonacci(input - 1)[0] + fibonacci(input - 2)[0];
            arr[input][1] = fibonacci(input - 1)[1] + fibonacci(input - 2)[1];
        }
        return arr[input];
    }
}
