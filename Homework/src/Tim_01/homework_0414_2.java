package Tim_01;

import java.util.Scanner;
import java.util.Stack;

public class homework_0414_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        char ch;
        while (true) {
            st.clear();
            String str = sc.nextLine();
            if (str.equals(".")) {
                break;
            }

            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if (ch == '(' || ch == '[') {
                    st.push(ch);
                } else if (ch == ')' || ch == ']') {
                    if (st.isEmpty() || (st.peek() == '(' && ch == ']') || (st.peek() == '[' && ch == ')')) {
                        st.push(ch);
                        break;
                    }
                    st.pop();

                }
            }

            if (!st.isEmpty())
                System.out.println("no");
            else
                System.out.println("yes");

        }
    }

}

