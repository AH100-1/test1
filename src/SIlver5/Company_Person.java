package SIlver5;

import java.io.*;
import java.util.*;

public class Company_Person {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());

        HashMap<String, String> hashMap = new HashMap<>();

        for (int i = 0; i < line; i++){
            String [] arr = br.readLine().split(" ");
            if (arr[1].equals("enter")){
                hashMap.put(arr[0], arr[1]);
            } else if(arr[1].equals("leave")) {
                hashMap.remove(arr[0]);
            }
        }
        List<Map.Entry<String, String>> entryList = new ArrayList<>(hashMap.entrySet());
        Collections.reverse(entryList);

        for (Map.Entry<String, String> entry : entryList) {
            System.out.println(entry.getKey());
        }
    }
}
