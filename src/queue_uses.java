import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class queue_uses {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        int result = 0;
        LinkedList <Integer> list = new LinkedList<>();

        for (int i = 0; i < line; i++){
            int j = Integer.parseInt(br.readLine());
            if (j != 0){
                list.add(j);
            } else {
                list.removeLast();
            }
        }

        while (!list.isEmpty()){
             result += list.getLast();
             list.removeLast();
        }

        System.out.println(result);
    }
}
