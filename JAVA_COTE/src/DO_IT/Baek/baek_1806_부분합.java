package DO_IT.Baek;
import java.util.Arrays;
import java.util.Scanner;

public class baek_1806_부분합 {

	public static void main(String[] args) {
		

/*
<문제>	자바11 : 1000ms
10,000 이하의 자연수로 이루어진 길이 N짜리 수열이 주어진다. 
이 수열에서 연속된 수들의 부분합 중에 그 합이 S 이상이 되는 것 중, 가장 짧은 것의 길이를 구하는 프로그램을 작성하시오.

<입력>
첫째 줄에 N (10 ≤ N < 100,000)과 S (0 < S ≤ 100,000,000)가 주어진다. 
둘째 줄에는 수열이 주어진다. 수열의 각 원소는 공백으로 구분되어져 있으며, 10,000이하의 자연수이다.

<출력>
첫째 줄에 구하고자 하는 최소의 길이를 출력한다. 만일 그러한 합을 만드는 것이 불가능하다면 0을 출력하면 된다.	

<예제 입력>
10 15
5 1 3 5 10 7 4 9 2 8

<예제 출력>
2

*/
		
	// <접근방법>
	// 1. 100,000,000 까지 데이터를 입력받을 수 있으니, 투 포인터 알고리즘을 활용해서
	//	  n(log) 시간 알고리즘을 사용해야한다. 
	
	Scanner sc = new Scanner(System.in);
	//수열의 갯수, 합을 입력받는다.
	
	long N, S;
	N = sc.nextLong();	S = sc.nextLong();
	long[] a_arr = new long[(int) N];
	
	//N만큼의 수열을 a_arr에 입력받는다.
	for(int i = 0; i < N; i++) {
		a_arr[i] = sc.nextInt();
	}
	
	// 오름차순 정렬
	Arrays.sort(a_arr);

	long sum = 0;
	int start = 0;
	int end = 0;
	int length = 0;
	int min = Integer.MAX_VALUE;
	
	while(end <= N) {

		if(sum >= S) {
			sum = sum - a_arr[start++];		//최소길이를 찾기 위해서 배열값을 하나씩 올리며 sum에서 값을 빼줌
			length = end - start + 1;	//end에서 start를 빼줘서 길이값을 구한다.(문제에서 index는 1을 기준으로 보고있음) 
			if(min > length) min = length;	
			
		}else if(sum < S) {
			//sum이 입력받은 최댓값보다 작다면 배열의 값을 하나씩 올려주며 end변수에 넣어준다.			
			sum = sum + a_arr[end++];
		}			
	}
	
	System.out.println(min);
	

	}

}
