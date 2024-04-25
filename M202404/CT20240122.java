/**
 * 백준 5430
 * @https://www.acmicpc.net/problem/5430
 * 문제
 * 선영이는 주말에 할 일이 없어서 새로운 언어 AC를 만들었다. AC는 정수 배열에 연산을 하기 위해 만든 언어이다. 이 언어에는 두 가지 함수 R(뒤집기)과 D(버리기)가 있다.
 * 함수 R은 배열에 있는 수의 순서를 뒤집는 함수이고, D는 첫 번째 수를 버리는 함수이다. 배열이 비어있는데 D를 사용한 경우에는 에러가 발생한다.
 * 함수는 조합해서 한 번에 사용할 수 있다. 예를 들어, "AB"는 A를 수행한 다음에 바로 이어서 B를 수행하는 함수이다. 예를 들어, "RDD"는 배열을 뒤집은 다음 처음 두 수를 버리는 함수이다.
 * 배열의 초기값과 수행할 함수가 주어졌을 때, 최종 결과를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. T는 최대 100이다.
 * 각 테스트 케이스의 첫째 줄에는 수행할 함수 p가 주어진다. p의 길이는 1보다 크거나 같고, 100,000보다 작거나 같다.
 * 다음 줄에는 배열에 들어있는 수의 개수 n이 주어진다. (0 ≤ n ≤ 100,000)
 * 다음 줄에는 [x1,...,xn]과 같은 형태로 배열에 들어있는 정수가 주어진다. (1 ≤ xi ≤ 100)
 * 전체 테스트 케이스에 주어지는 p의 길이의 합과 n의 합은 70만을 넘지 않는다.
 *
 * solve (TineOut)
 */


package M202404;

import java.io.*;
import java.util.*;

public class CT20240122 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        //테스트 케이스 개수 입력
        int T = Integer.parseInt(br.readLine());

        ArrayList<String> sol = new ArrayList<>();

        //테스트 케이스 Loop
        for(int i = 0; i < T; i++){

            //명령어 입력
            String command = br.readLine();

            //배열 길이 입력
            int arrLength = Integer.parseInt(br.readLine());

            //배열 입력
            String arr = br.readLine();

            arr = arr.replace(",", "").replace("[", "").replace("]", "");

            ArrayList<String> tmpList = new ArrayList<>();

            for (int j = 0; j < arrLength; j++) {
                tmpList.add(String.valueOf(arr.charAt(j)));
            }


            for(int o = 0; o < command.length(); o++){
                if(command.charAt(o) == 'D'){
                    if(arrLength == 0) {
                        tmpList.add("error");
                        break;
                    }
                    tmpList.remove(0);
                    arrLength -= 1;

                } else if (command.charAt(o) == 'R') {
                    Collections.reverse(tmpList);
                }
            }

            sol.add(String.valueOf(tmpList));
        }
        for(Object e : sol){
            if(e.toString().equals("[error]")){
                bw.write("error");
            }else{
                bw.write(e.toString());
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}
