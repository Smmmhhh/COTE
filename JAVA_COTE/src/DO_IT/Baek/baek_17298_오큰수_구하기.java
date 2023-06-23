package DO_IT.Baek;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Scanner;

public class baek_17298_오큰수_구하기 {

	public static void main(String[] args) throws IOException{
		
//		<문제>
//		크기가 N인 수열 A = A1, A2, ..., AN이 있다. 
//		수열의 각 원소 Ai에 대해서 오큰수 NGE(i)를 구하려고 한다. 
//		Ai의 오큰수는 오른쪽에 있으면서 Ai보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다. 
//		그러한 수가 없는 경우에 오큰수는 -1이다.
//
//		예를 들어, A = [3, 5, 2, 7]인 경우 
//		NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1이다. 
//		A = [9, 5, 4, 8]인 경우에는 NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1이다.
//
//		<입력>
//		첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
//		둘째 줄에 수열 A의 원소 A1, A2, ..., AN (1 ≤ Ai ≤ 1,000,000)이 주어진다.
//
//		<출력>
//		총 N개의 수 NGE(1), NGE(2), ..., NGE(N)을 공백으로 구분해 출력한다.	
//		
//		<예제입력>
//		4
//		3 5 2 7
//		
//		<예제출력>
//		5 7 7 -1

		
		//수열의 크기 및 수열의 크기로 배열지정
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		String[] input = br.readLine().split(" ");
		//수열 입력받기
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(input[i]);
		}
		
		
		
		//스택 지정
		Stack<Integer> stack = new Stack <Integer>();		
		StringBuilder sb = new StringBuilder();
		int num;
		boolean result = false;
		//스택 알고리즘
		 for(int i = 0; i < A.length; i++) {
			 
			 //처음 i값을 stack에 넣어준다.
			 
			 stack.push(A[i]);
			 for(int j = i; j < A.length; j++) {
				 num = A[j];
				 // 스택에 첫 요소와 배열의 요소들을 하나씩 비교
				 // 만약 값이 같으면 j 변수 반복문 종료
				 int k = stack.peek();
				 if(k < num){
					 sb.append(num + " ");
					 result = true;
					 break;
				 // j 반복문이 끝났는데도 더 큰값이 없다면 -1저장
				 }else if(j >= A.length-1 && !result) {
					 sb.append(-1 + " ");
				 }
			 }
			 stack.clear();
			 result = false;
 
		 }	
		 System.out.println(sb);
	}

}
