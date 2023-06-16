package exam;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
/*
100 이하의 자연수를 입력받아 첫 번째 항은 100으로 두 번째 항은 입력받은 수로 초기화하고 
다음 항부터는 전전항에서 전항을 뺀 수로 채워나가는 수열을 작성하여 
그 수가 음수가 나올 때까지 출력하는 프로그램을 작성하시오.
*/
		
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[100];
	int num;
	num = sc.nextInt();
	int i = 3;
	
	//첫 항은 100으로 고정 
	arr[0] = 100;
	arr[1] = num;
	arr[2] = arr[0] - arr[1];
	
	while(true) {
		arr[i] = arr[i-1] - num;
		if(arr[i] < 0) {
			arr[i] = 0;
			break;
		}
		i++;
	}
	
	for(int j = 0; j < arr.length; j++) {
		System.out.print(arr[j] + " ");
	}
	
	}
}
