package DO_IT.Baek;
import java.util.Scanner;
import java.util.Stack;

public class baek_1874_스택 {

	public static void main(String[] args) {
		
/*
<문제>	제한시간 : 2000ms
스택 (stack)은 기본적인 자료구조 중 하나로, 
컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다. 
스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 나중에 들어간 자료가 제일 먼저 나오는 
(LIFO, Last in First out) 특성을 가지고 있다.

1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 
이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자. 
임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 
있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 이를 계산하는 프로그램을 작성하라.

<입력>
첫 줄에 n (1 ≤ n ≤ 100,000)이 주어진다. 
둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다. 
물론 같은 정수가 두 번 나오는 일은 없다.

<출력>
입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다. 
push연산은 +로, pop 연산은 -로 표현하도록 한다. 불가능한 경우 NO를 출력한다.

<예제 입력>		
8
4
3
6
8
7
5
2
1

<예제출력>
+
+
+
+
-
-
+
+
-
+
+
-
-
-
-
-


 */
		// 수열 갯수 입력받기 && 수열 채우기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A_arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			A_arr[i] = sc.nextInt();
		}
		
		// 스택설정
		Stack<Integer> st = new Stack<>();
		// 스택 알고리즘
		int num = 1;
		boolean result = false;
		StringBuffer bu = new StringBuffer(); 
		
		for(int i = 0; i < n; i++){
			//int su = A_arr[i];
			if(A_arr[i] >= num) {	//수열의 값이 오름차순 자연수보다 클때
				while(A_arr[i] >= num) {	//수열의 값과 같을 때까지 스택에 데이터 쌓아줌
					st.push(num++);
					bu.append("+\n");
				}
				st.pop();					//스택과 오름차순 자연수가 같기 때문에 스택을 하나 뺴준다.
				bu.append("-\n");
			}else{		//스택보다 오름차순 자연수가 더 크나면
				int k = st.pop();
				
				if(k > A_arr[i]) {		//pop이후 스택과 오름차순 자연수를 비교 후 스택값이 크다면 no출력 
					System.out.println("NO");
					result = true;
					break;
				}else {				//만약 오름차순 자연수가 더 크거나 같다면 pop
					bu.append("-\n");
				}
					
			}
			
		}
		if(result == false) System.out.println(bu.toString());
		System.out.println(st);

	}

}
