package SIlver5;

import java.io.*;
import java.util.*;

public class number_Card {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int [] arr = new int[num];

        StringTokenizer stk = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(arr);

        int find = Integer.parseInt(br.readLine());
        int[] arr2 = new int[find];
        StringTokenizer stk2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < find; i++){
            arr2[i] = Integer.parseInt(stk2.nextToken());
            System.out.print(findEnd(arr ,arr2[i]) - findStart(arr ,arr2[i]) + " ");
        }
    }
    public static int findStart(int[] arr, int n){
        int start = 0;
        int end = arr.length;

        while (start < end){
            int middle = (start + end)/2;
            if (n > arr[middle]){
                start = middle + 1;
            }else{
                end = middle;
            }
        }
        return start;
    }
    public static int findEnd(int[] arr, int n){
        int start = 0;
        int end = arr.length;
        while (start < end){
            int middle = (start + end)/2;
            if (n >= arr[middle]){
                start = middle + 1;
            }else {
                end = middle;
            }
        }
        return start;
    }
}
