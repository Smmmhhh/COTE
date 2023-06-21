package DO_IT.Baek;

import java.util.Scanner;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baek_3986_좋은단어 {
	public static void main(String[] args) throws IOException{
		
//		<문제>
//		이번 계절학기에 심리학 개론을 수강 중인 평석이는 오늘 자정까지 보고서를 제출해야 한다. 
//		보고서 작성이 너무 지루했던 평석이는 노트북에 엎드려서 꾸벅꾸벅 졸다가 제출 마감 1시간 전에 깨고 말았다. 
//		안타깝게도 자는 동안 키보드가 잘못 눌려서 보고서의 모든 글자가 A와 B로 바뀌어 버렸다! 
//		그래서 평석이는 보고서 작성을 때려치우고 보고서에서 '좋은 단어'나 세보기로 마음 먹었다.
//
//		평석이는 단어 위로 아치형 곡선을 그어 같은 글자끼리(A는 A끼리, B는 B끼리) 쌍을 짓기로 하였다. 
//		만약 선끼리 교차하지 않으면서 각 글자를 정확히 한 개의 다른 위치에 있는 같은 글자와 짝 지을수 있다면, 
//		그 단어는 '좋은 단어'이다. 평석이가 '좋은 단어' 개수를 세는 것을 도와주자.
//
//		<입력>
//		첫째 줄에 단어의 수 N이 주어진다. (1 ≤ N ≤ 100)
//		다음 N개 줄에는 A와 B로만 이루어진 단어가 한 줄에 하나씩 주어진다. 
//		단어의 길이는 2와 100,000사이이며, 모든 단어 길이의 합은 1,000,000을 넘지 않는다.
//
//		<출력>
//		첫째 줄에 좋은 단어의 수를 출력한다.
		
//		<입력예제>
//		3
//		ABAB
//		AABB
//		ABBA
//		
//		<출력예제>
//		2
		
		//수열 갯수와, 문자 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str;
		int length;
		int count = 0;
		boolean result = false;
		//입력받은 문자를 stack에 넣어줌
		Stack<Character> stack = new Stack<Character>();
		
//		int c = 0; int s = 0;
		
		for(int i = 0; i < N; i++) {
			str = br.readLine();
			length = str.length();
			if(length % 2 != 0) continue;	//입력받은 문자길이가 홀수면 바로 끝내주기 추가하자
			
			stack.push(str.charAt(0));	//첫 스택은 바로 넣어준다.
			// 입력받은 문자열을 문자열의 길이만큼 스택에 바로 쌓아준다.
			for(int j = 1; j < length; j++) {
				char ch = str.charAt(j);	//현재 문자열 저장
				if(stack.size() >= 1 && stack.peek() == ch) {
					stack.pop();
					continue;
				}else stack.push(str.charAt(j));
				
			}
			if(stack.size() == 0) {
					count++; 
			}
			stack.clear();
		}

//		System.out.println(stack);	//스택 값 확인
		System.out.println(count);
		
		
	}
}
