package M202405;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class CT20240504 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0, k = 1; i < cnt; i++, k++) {
            Stack<String> st = new Stack<>();
            String sentence = br.readLine();
            StringTokenizer token = new StringTokenizer(sentence, " ");

            while (token.hasMoreTokens()){
                st.push(token.nextToken());
            }
            String work = "";
            while (!st.isEmpty()){
                work = work.concat(st.pop() + " ");
            }
            work = "Case #" + k + ": " + work.stripTrailing();
            bw.write(work + "\n");
        }
        bw.flush();
        bw.close();
    }

}
