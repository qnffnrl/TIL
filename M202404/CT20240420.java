/**
 * 백준 1764
 * @https://www.acmicpc.net/problem/1764
 * 명 수, 듣보잡 중복자 출력 (사전순)
 *
 * fork
 */

package M202404;
import java.io.*;
import java.util.*;

public class CT20240420 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<String> hs = new HashSet<String>();
        ArrayList<String> list = new ArrayList<String>();


        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++){
            hs.add(br.readLine());
        }

        for(int i = 0; i < m; i++){
            String b = br.readLine();
            if(hs.contains(b)){
                list.add(b);
            }
        }

        Collections.sort(list);

        bw.write(list.size() + "\n");
        for(Object e: list){
            bw.write(e + "\n");
        }

        bw.flush();
        bw.close();

    }

}

/**
 * BufferedReader -> 데이터 입력받는 함수
 * BufferedWriter -> 입력 받은 데이터를 출력 하는 함수
 * ==============================================================================
 * % Scanner 및 Sout과 유사하지만 속도 측면에서 훨씬 빠름
 * % 입력된 데이터가 바로 전달되지 않고 버퍼를 거쳐 전달되어 데이터 처리 효율성을 높임
 * % 많은 양의 데이터를 처리하는데 유리
 * ----
 * ! BufferedWriter, 출력 후 flush(), close()로 마무리를 해줘야됨
 * ! readLine() 함수 -> 입력 값이 문자열로 고정됨, 타 타입 사용시 캐스팅 필요
 */

/**
 * StringTokenizer -> 문자열을 특정 문자 기준으로 잘라줌
 * ==============================================================================
 * Split과 유사
 */
