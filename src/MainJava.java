import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainJava {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        String [] input = br.readLine().split(" ");
        int [] num = new int[input.length];

        for (int i = 0; i < input.length; i++){
            num[i] = Integer.parseInt(input[i]);
        }

        for (int i = 1; i <= num[0]; i++){
            list.add(Integer.toString(i));
        }

        for (int i = 0; i < num[1]; i++){
            String order = br.readLine();

            if (order.equals("raise")){
                list.add(list.getFirst());
                list.removeFirst();
            }else {
                list.removeFirst();
            }
        }
        System.out.print(list.getFirst());
    }
}
