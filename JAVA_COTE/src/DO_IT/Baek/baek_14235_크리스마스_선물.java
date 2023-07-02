package DO_IT.Baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class baek_14235_크리스마스_선물 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 거점지 방문 횟수
		StringBuffer sb = new StringBuffer();

		PriorityQueue<Integer> myQueue = new PriorityQueue<>(Collections.reverseOrder()); // 오름차순 우선순위 큐

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(st.nextToken()); // V == 0 선물, v != 거점
			// 거점일 경우
			if (V != 0) {
				for (int j = 0; j < V; j++) {
					myQueue.offer(Integer.parseInt(st.nextToken()));
					System.out.println();
				}
				// 선물을 줄경우
			} else if (V == 0) {
				if (!myQueue.isEmpty()) {
					int temp = myQueue.poll();
					sb.append(temp + "\n");
				} else if (myQueue.isEmpty()) {
					sb.append(-1 + "\n");
				}

			}
		}
		System.out.println(sb);

	}

}
