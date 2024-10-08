import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Card {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        LinkedList <Integer> list = new LinkedList<>();

        for (int i = 1; i <= line; i++){
            list.add(i);
        }

        while (list.size() != 1){
            list.removeFirst();
            list.add(list.getFirst());
            list.removeFirst();
        }

        System.out.println(list.getFirst());
    }
}
