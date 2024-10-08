import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Balanced_World {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            Stack<String> st = new Stack<>();
            String input = br.readLine();

            if (input.equals(".")) {
                break;
            }

            String[] arr = input.split("");

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("(") || arr[i].equals("[")) {
                    st.push(arr[i]);
                } else if (arr[i].equals(")")) {
                    if (!st.isEmpty()){
                        if (st.peek().equals("(")) {
                            st.pop();
                        } else {
                            st.push(arr[i]);
                            break;
                        }
                    }else{
                        st.push(arr[i]);
                        break;
                    }
                } else if (arr[i].equals("]")) {
                    if (!st.isEmpty()){
                        if (st.peek().equals("[")) {
                            st.pop();
                        } else {
                            st.push(arr[i]);
                            break;
                        }
                    }else {
                        st.push(arr[i]);
                        break;
                    }
                }
            }
            if (st.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
