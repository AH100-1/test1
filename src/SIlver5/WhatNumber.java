package SIlver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class WhatNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk1 = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(stk1.nextToken());
        int find = Integer.parseInt(stk1.nextToken());
        int[] arr = new int[num];

        StringTokenizer stk2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(stk2.nextToken());
        }
        Arrays.sort(arr);

        System.out.println(arr[find - 1]);
    }
}
