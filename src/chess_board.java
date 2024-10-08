import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chess_board {
    public static boolean board[][];
    public static int min = 64;

    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] line = br.readLine().split(" ");

        int x = Integer.parseInt(line[0]);
        int y = Integer.parseInt(line[1]);
        board = new boolean[x][y];

        for (int i = 0; i < x; i++){
            String [] input= br.readLine().split("");
            for (int j = 0; j < y; j++){
                if (input[j].equals("W")){
                    board[i][j] = true;
                } else {
                    board[i][j] = false;
                }
            }
        }
        int x_col = x - 7;
        int y_row = y - 7;

        for (int i = 0; i < x_col; i++){
            for(int j = 0; j < y_row; j++){
                find(i, j);
            }
        }
        System.out.println(min);
    }
    public static void find(int x, int y){
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;
        boolean check = board[x][y];

        for (int i = x; i < end_x; i++){
            for (int j = y; j < end_y; j++){
                if (board[i][j] != check){
                    count++;
                }
                check = !check;
            }
            check = !check;
        }
        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }
}
