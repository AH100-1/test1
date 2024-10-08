package SIlver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Set {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int bitset = 0;

        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().split(" ");
            String cmd = input[0];
            int x = (input.length > 1) ? Integer.parseInt(input[1]) : 0;

            switch (cmd) {
                case "add":
                    bitset |= (1 << x);
                    break;
                case "remove":
                    bitset &= ~(1 << x);
                    break;
                case "check":
                    sb.append((bitset & (1 << x)) != 0 ? 1 : 0).append("\n");
                    break;
                case "toggle":
                    bitset ^= (1 << x);
                    break;
                case "all":
                    bitset = (1 << 21) - 1;  // 0b111111111111111111111
                    break;
                case "empty":
                    bitset = 0;
                    break;
            }
        }

        System.out.print(sb.toString());
    }
}
