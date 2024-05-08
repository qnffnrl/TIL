package M202405;

import java.util.*;

public class CT20240504_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(sc.nextLine());
        String[] P = sc.nextLine().split(" ");

        if(N < P.length - (N - 1)) return;

        for (String time : P) {
            list.add(Integer.parseInt(time));
        }
        Collections.sort(list);

        int sum = 0;
        int realSum = 0;
        for(int e : list){
            sum += e;
            realSum += sum;
        }
        System.out.println(realSum);
    }
}
