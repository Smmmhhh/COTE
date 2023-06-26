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
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];	//입력받은 배열
		int[] B = new int[N];	//결과 배열
		
		String[] input = br.readLine().split(" ");
		//수열 입력받기
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(input[i]);
		}
		
		
		
		//스택 지정
		Stack<Integer> stack = new Stack <Integer>();		
		StringBuilder sb = new StringBuilder();
		
		//초기값 스택에 넣어주기
		
		for(int i = 0; i < N; i++) {
			
			while(!stack.empty() && (A[stack.peek()] < A[i])) {
				
				B[stack.pop()] = A[i];
			}
			
			stack.push(i);
		}
		
		while(!stack.empty()) {
			B[stack.pop()] = -1;
		}
		
		//결과 배열 출력
		for(int i = 0; i < N; i++) {
			sb.append(B[i]).append(' ');
		}
		System.out.println(sb);
	}

}
