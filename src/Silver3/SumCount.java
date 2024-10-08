package Silver3;

import java.io.*;

public class SumCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int line = Integer.parseInt(br.readLine());
        int[] count = new int[11];

        count[1] = 1;
        count[2] = 2;
        count[3] = 4;

        for (int i = 4; i < 11; i++) {
            count[i] = count[i - 1] + count[i - 2] + count[i - 3];
        }

        for (int i = 0; i < line; i++) {
            int find = Integer.parseInt(br.readLine());
            bw.write(count[find] + "\n");
            bw.flush();
        }
    }
}