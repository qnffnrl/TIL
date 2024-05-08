package M202405;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CT20240508 {


    static int[][] arr;
    static boolean[] check;

    static Queue<Integer> q = new LinkedList<>();

    static int node, line, start = 1, cnt = 0;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        node = Integer.parseInt(sc.nextLine());
        line = Integer.parseInt(sc.nextLine());

        arr = new int[node+1][node+1];
        check = new boolean[node+1];

        for(int i = 0; i < line; i++){

            StringTokenizer st = new StringTokenizer(sc.nextLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        bfs(start);

        System.out.println(cnt);
        sc.close();
    }

    public static void bfs(int start){
        q.add(start);
        check[start] = true;

        while (!q.isEmpty()){

            start = q.poll();

            for(int i = 1; i <= node; i++) {
                if(arr[start][i] == 1 && !check[i]){
                    q.add(i);
                    check[i] = true;
                    cnt++;
                }
            }
        }

    }

}
