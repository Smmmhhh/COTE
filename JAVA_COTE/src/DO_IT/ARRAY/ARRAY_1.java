package DO_IT.ARRAY;
import java.util.Scanner;

public class ARRAY_1 {

	public static void main(String[] args) {

/*

<문제>	제한시간 : 1000ms
N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

<입력>
첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 
이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. 
N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.

<출력>
첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.

<예제입력>
3 3
1 1 1
2 2 2
0 1 0
3 3 3
4 4 4
5 5 100

<예제 출력>
4 4 4
6 6 6
5 6 100

*/

	// < 접근방법 > 
	// 1. 입력받은 N * M의 2행렬을 만들어준다.
	// 2. N * M의 수만큼 행렬값을 입력받는다. 
	// 3. 입력받은 2개의 행렬값의 합을 sum행렬에 더해준다.
	
	Scanner sc = new Scanner(System.in);
	//배열 크기 입력받기, 2개의 배열 선언해주기
	int N = 0, M = 0;
	N = sc.nextInt();
	M = sc.nextInt();
	

	
	long [][] a_arr = new long[N][M];
	long [][] b_arr = new long[N][M];
	long [][] s_arr = new long[N][M];
	
	
	// A 배열에 숫자값 입력받기
	for(int i = 0; i < N; i++) {
		for(int j = 0; j < M; j++) {
			a_arr[i][j] = sc.nextLong();
		}
	}
	// B 배열에 숫자값 입력받기	
	for(int i = 0; i < N; i++) {
		for(int j = 0; j < M; j++) {
			b_arr[i][j] = sc.nextLong();
		}
	}
	
	double before_Time_2 = System.currentTimeMillis();	//입력받은 뒤 실행기간 체크 
	
	// 두개의 배열값 더하기, 출력하기
	for(int i = 0; i < N; i++) {
		for(int j = 0; j < M; j++) {
			s_arr[i][j] = a_arr[i][j] + b_arr[i][j];
			System.out.print(s_arr[i][j] + " ");
		}
		System.out.println();
	}
 	
	//실행시간 출력
	double after_Time_2 = System.currentTimeMillis();
	double secDiff_Time_2 = (after_Time_2 - before_Time_2);
	System.out.println("스캔시간 : "+ secDiff_Time_2);
		
		
		
	}

}
