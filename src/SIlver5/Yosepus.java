package SIlver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Yosepus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(stk.nextToken());
        int repeat = Integer.parseInt(stk.nextToken());

        Queue queue = new LinkedList();
        for (int i = 1; i <= num; i++){
            queue.add(i);
        }

        System.out.print("<");
        for (int i = 1; i <= num; i++){
            for (int j = 0; j < repeat - 1; j++){
                queue.add(queue.poll());
            }
            if (i == num){
                System.out.print(queue.poll());
                break;
            }
            System.out.print(queue.poll() + ", ");
        }
        System.out.print(">");
    }
}
