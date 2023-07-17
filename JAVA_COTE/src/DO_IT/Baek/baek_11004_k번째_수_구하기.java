package DO_IT.Baek;

import java.util.Scanner;

public class baek_11004_k번째_수_구하기 {
	
	private static void quickSortTemp(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	// start와 end는 index값
	private static void quickSort(int[] arr, int start, int end) {
		if (start >= end) { // 원소가 1개인경우
			return;
		}
		int p = start; 						// pivot값
		int i = start + 1; 					// pivot다음부터 start
		int j = end;

		while (i <= j) { 					// 엇갈릴 때까지 반복 i가 j보다 커지면 엇갈림이 일어난거임
			while (arr[i] <= arr[p] && end > i)
				i++; 						// pivot 보다 큰 값을 만날 때 까지 start index++
			while (arr[j] >= arr[p] && start < j)
				j--; 						// pivot 보다 작은 값을 만날 때 까지 end index--
			if (i >= j) { 					// 엇갈렸다면 p와 j를 바꿔줌
				int temp = arr[j];
				arr[j] = arr[p];
				arr[p] = temp;
			}else {							//엇갈린게 아니라면 i와 j를 바꿔줌
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		quickSort(arr, start, j - 1);
		quickSort(arr, j + 1, end);
	}
	
//	private static void swap(int[] arr, int start, int end) {
//		int temp = arr[start];
//		arr[start] = arr[end];
//		arr[end] = temp;
//	}
	
	private static void quickPrint(int[] arr, int k) {
		System.out.print(arr[k-1]);
	}

	public static void main(String[] args) {

		// 입력받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		// 배열 선언
		int[] A = new int[N];

		// 배열값 저장하기
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		// 퀵정렬 호출
		quickSortTemp(A);

		// 정렬 후 k번째 수 출력
		//quickPrint(A, K);

	}
}
