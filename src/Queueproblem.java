import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Queueproblem {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> queue = new LinkedList<>();

        int input = Integer.parseInt(br.readLine());
        for (int i = 0; i < input; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            switch (stk.nextToken()){
                case "push" :
                    queue.add(Integer.parseInt(stk.nextToken()));
                    break;

                case "front" :
                    if (queue.isEmpty()){
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(queue.getFirst());
                    break;

                case "pop" :
                    if (queue.isEmpty()){
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(queue.getFirst());
                    queue.removeFirst();
                    break;

                case "back" :
                    if (queue.isEmpty()){
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(queue.getLast());
                    break;
                case "empty" :
                    if (queue.isEmpty()){
                        System.out.println(1);
                        break;
                    } else {
                        System.out.println(0);
                        break;
                    }
                case "size" :
                    System.out.println(queue.size());
                    break;
            }
        }


    }
}
