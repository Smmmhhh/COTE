package Doit_1_2_0616_0823_SMH;
import java.util.Scanner;

public class Doit_1_2_0616_0823_SMH {

	public static void main(String[] args) {
				
/* 
<문제>	시간제한 1000ms
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

<입력>
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

<입출력 예제>
- 입력 -					
3				
123

- 출력 - 
6

*/
		
		// n1, n2입력받기
		Scanner sc = new Scanner(System.in);
		long n1, n2;
		n1 = sc.nextLong();
		n2 = sc.nextLong();
		
		// 입력값을 받은 후 시간측정
		double before_Time = System.currentTimeMillis();
		
		
		
		//0부터 최대 100개 까지의 범위를 입력받으니 101개의 배열 등록
		long arr[] = new long[101];	
		
		//n1의 값이 1 <= n1 <= 100의 범위를 벗어났을 때 main함수 종료
		if(0 > n1 || 100 < n1) {
			System.out.println("입력값이 잘못되었습니다.");
			return;
		}
		
		
		
		/*접근방법 
		 1. n1의 값을 10^(n1-1)을 연산해준뒤 빈(temp) 변수에 넣어준다.(자바는 Math.pow()함수 이용)
		 2. temp변수를 이용해서 n2의 값을 나눈다 -> n2 / temp;
		 2-1. ex) n1 = 3, n2 = 123, temp = 100 
		 2-2. 123 / 100 = 1 -> 입력된 3자리의 정수중 3번째 자리수 구함
		 2-3. 해당값을 arr[0] 배열에 넣어줌 
		 2-4. n2값을 arr[0] * temp의 값으로 - 연산을 진행
		 2.5. (n2 = 123) - (arr[0] = 1) * (temp = 100) == 123 - 100 = (n2 = 23)
		 2-6. 이유는 다음 루프문이 돌때 n2값을 감소시키지 않으면 n2 = 123 / 10을 진행하게된다. 
				그럼 arr[1]의 값은 12가 들어가게 된다.  
		 2-7. 반복문이 루프문이 돌때마다 temp / 10을 해준 뒤 2번의 과정을 반복
		 3. 반복문을 이용해서 arr 배열의 항들을 전부 더한 뒤 마지막에 출력을 해준다.
		*/
		
		long temp = (long) Math.pow(10, n1-1);
		//System.out.print(temp);	-> 제곱 값 테스트 해보기
		
		for(int i = 0; i < n1; i++) {
			arr[i] = n2 / temp;
			n2 = n2 - (arr[i] * temp);
			temp /= 10;
		}
		
		// arr배열의 합계 구하기
		long sum = 0;
		for(int i = 0; i < n1; i++) {
			//System.out.print(arr[i] + " ");	-> arr배열 출력 테스트 해보기
			sum += arr[i];
		}
		
		// 합계 출력
		System.out.println(sum);
		
		double after_Time = System.currentTimeMillis();
		double secDiff_Time = (after_Time - before_Time);
		System.out.println("시간차이(m) : "+ secDiff_Time);

		
		
		/* 예상 질문
		  1. long형을 사용한 이유
		   -> int형의 최댓값은 2word, long 형의 최댓값은 4word 이다. 
		   실제 코딩테스트를 볼 때 자료형의 오버플로우 or 언더플로우 때문에 알고리즘을 풀었음에도 떨어지는 경우가 있다고한다.
		   위 현상을 방지하기 위해 long형을 사용함.
		   
		  2. 실행시간을 찍어본 이유
		  -> 코딩 테스트는 시간이 넉넉하게 주어지지 않는다.
		  그러므로 자신의 작성한 코드의 실행시간을 출력해보며 실습에 대비한다.
		  
		 */
	}
}
