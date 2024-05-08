package M202405;

import java.util.Scanner;
import java.util.Stack;

public class CT20240504_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        int cnt = sc.nextInt();

            for(int i = 0; i < cnt; i++) {

                int k = sc.nextInt();
                if (k == 0) {
                    st.pop();
                } else {
                    st.push(k);
                }
            }

        if (st.isEmpty()) {
                System.out.println(0);
                return;
            }
            int sum = 0;
            while (!st.isEmpty()){
                int num = st.pop();
                sum += num;
            }
            System.out.println(sum);
    }
}
