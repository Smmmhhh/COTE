package DO_IT.Baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//	<문제>
//	크리스마스에는 산타가 착한 아이들에게 선물을 나눠준다. 올해도 산타는 선물을 나눠주기 위해 많은 노력을 하고 있는데, 
//	전세계를 돌아댕기며 착한 아이들에게 선물을 나눠줄 것이다. 하지만 산타의 썰매는 그렇게 크지 않기 때문에, 
//	세계 곳곳에 거점들을 세워 그 곳을 방문하며 선물을 충전해 나갈 것이다. 
//	또한, 착한 아이들을 만날 때마다 자신이 들고있는 가장 가치가 큰 선물 하나를 선물해 줄 것이다.
//	이제 산타가 선물을 나눠줄 것이다. 차례대로 방문한 아이들과 거점지의 정보들이 주어졌을 때, 
//	아이들이 준 선물들의 가치들을 출력하시오. 만약 아이들에게 줄 선물이 없다면 -1을 출력하시오.
//	
//	<입력>
//	첫 번째 줄에서는 아이들과 거점지를 방문한 횟수 n이 주어진다.(1≤n≤5,000)
//	
//	다음 n줄에는 a가 들어오고, 그 다음 a개의 숫자가 들어온다. 이는 거점지에서 a개의 선물을 충전하는 것이고, 
//	그 숫자들이 선물의 가치이다. 만약 a가 0이라면 거점지가 아닌 아이들을 만난 것이다. 
//	선물의 가치는 100,000보다 작은 양의 정수이다.(1≤a≤100)
//	
//	<출력>
//	a가 0일 때마다, 아이들에게 준 선물의 가치를 출력하시오. 
//	만약 줄 선물이 없다면 -1을 출력하라. 적어도 하나의 출력이 있음을 보장한다.
//
//	<입력예제>
//	5
//	0
//	2 3 2
//	0
//	0
//	0
//	
//	<출력 예제>
//	-1
//	3
//	2
//	-1

public class baek_14235_크리스마스_선물 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 거점지 방문 횟수
		StringBuffer sb = new StringBuffer();

		PriorityQueue<Integer> myQueue = new PriorityQueue<>(Collections.reverseOrder()); // 오름차순 우선순위 큐

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(st.nextToken()); // V == 0 선물, v != 거점
			// 거점일 경우
			if (V != 0) {
				for (int j = 0; j < V; j++) {
					myQueue.offer(Integer.parseInt(st.nextToken()));
				}
				// 선물을 줄경우
			} else if (V == 0) {
				if (!myQueue.isEmpty()) {
					int temp = myQueue.poll();
					sb.append(temp).append("\n");
				} else if (myQueue.isEmpty()) {
					sb.append(-1).append("\n");
				}

			}
		}
		System.out.print(sb.toString());

	}

}
