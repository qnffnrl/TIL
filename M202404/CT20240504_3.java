package M202404;

import java.io.*;
import java.util.PriorityQueue;

public class CT20240504_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> pQ = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                if(pQ.isEmpty()){
                    bw.write("0" + "\n");
                }else {
                    bw.write(pQ.poll() + "\n");
                }
            }else{
                pQ.offer(x);
            }
        }

        bw.flush();
        bw.close();
    }
}
