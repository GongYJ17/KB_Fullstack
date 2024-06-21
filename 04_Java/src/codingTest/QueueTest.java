package codingTest;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class QueueTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> Q = new LinkedList<>();


        //1. 1부터 N까지를 Q에 더해봅시다 - add, offer (try-catch의 catch문 같은 역할)
        for (int i = 1; i <= N; i++) {
            Q.offer(i);
            System.out.println(Q.size());
        }
        System.out.println();

        //2. 값을 조회하여봅시다 - element, peek, contains, size
        System.out.println(Q.element()); //1 (오류 났을 때 씀, 예외처리 불가 -> 바로 다운됨)
        System.out.println(Q.peek()); //1 (오류 났을 때 씀, 예외처리 가능(null값이 반환됨.))
        System.out.println(Q.contains(3)); // 3이 포함됐는 지를 나타냄. return은 boolean값.
        System.out.println(Q.size()); // 총 값의 개수를 알려줌.
        System.out.println();



        //3. 값을 삭제하여봅시다 - remove, poll, clear
        System.out.println(Q.remove()); // 맨 앞의 값을 삭제 반환
        System.out.println(Q.peek()); // 맨 앞의 값을 확인
        System.out.println(Q.poll()); // 맨 앞의 값을 제거하고 반환
        System.out.println(Q.poll()); // 위와 동일
        Q.clear(); // 내용을 아예 초기화
        System.out.println(Q.peek()); // Q값이 없어지니 예외 처리를 함.(null 값을 반환해줌.)
//        System.out.println(Q.element()); // Q값이 없어지니 에러나고 예외 처리 안해줌.
        System.out.println();

//
        //4. 값이 비어있는지 확인하여봅시다
        System.out.println(Q.isEmpty()); // Q가 비워져 있으면 ture 값 반환
        Q.add(1); // 추가
        System.out.println(Q.isEmpty()); // Q가 안 비워져 있으면 false 값 반환
//
        br.close();
    }
}