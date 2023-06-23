package DO_IT.Baek;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
import java.util.Stack;


public class baek_17608_막대기 {

	public static void main(String[] args) throws IOException{
		
//		<문제> 제한시간 : 1000ms
		
//		아래 그림처럼 높이만 다르고 (같은 높이의 막대기가 있을 수 있음) 모양이 같은 막대기를 일렬로 세운 후, 
//		왼쪽부터 차례로 번호를 붙인다. 각 막대기의 높이는 그림에서 보인 것처럼 순서대로 6, 9, 7, 6, 4, 6 이다. 
//		일렬로 세워진 막대기를 오른쪽에서 보면 보이는 막대기가 있고 보이지 않는 막대기가 있다. 
//		즉, 지금 보이는 막대기보다 뒤에 있고 높이가 높은 것이 보이게 된다. 
//		예를 들어, 그림과 같은 경우엔 3개(6번, 3번, 2번)의 막대기가 보인다.
//
//		N개의 막대기에 대한 높이 정보가 주어질 때, 
//		오른쪽에서 보아서 몇 개가 보이는지를 알아내는 프로그램을 작성하려고 한다.

//		<입력>
//		첫 번째 줄에는 막대기의 개수를 나타내는 정수 N (2 ≤ N ≤ 100,000)이 주어지고 
//		이어지는 N줄 각각에는 막대기의 높이를 나타내는 정수 h(1 ≤ h ≤ 100,000)가 주어진다.
//		
//		<출력>
//		오른쪽에서 N개의 막대기를 보았을 때, 보이는 막대기의 개수를 출력한다.
//		
//		<예제입력>
//		6
//		6
//		9
//		7
//		6
//		4
//		6
//		
//		<출력>
//		3
		
//		<접근방법>
//		1. 마지막에 입력받은 수열보다 큰 수의 갯수를 구한 뒤 +1 을 해준다.
		
		
		
		//수열 갯수와 수열입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int A[] = new int[N];
		int temp = 0;
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(br.readLine());
			//마지막 입력값 Temp에 저장
			if(i >= N-1) temp = A[i];
		}
		
		//Stack 알고리즘 시작
		Stack <Integer> st = new Stack<Integer>();
		
		//초기에 스택하나 넣어줌
		st.push(temp);
		for(int i = A.length-2 ; i >= 0; i--) {
			if(st.peek() < A[i]) st.push(A[i]);
		}
		
		System.out.println(st.size());
	}

}
