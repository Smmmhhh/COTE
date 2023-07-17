package DO_IT.Baek;

import java.util.Scanner;

public class baek_24090_퀵정렬1 {
	static int count = 0;

	private static void quickSortTemp(int[] arr, int k) {
		quickSort(arr, 0, arr.length - 1, k);
	}

	private static void quickSort(int[] arr, int start, int end, int k) {
		if (start < end) {
			int p = partition(arr, start, end, k);
			quickSort(arr, start, p - 1, k);
			quickSort(arr, p + 1, end, k);
		}
	}

	private static int partition(int[] arr, int start, int end, int k) {
		int p = arr[end];
		int s = start - 1;

		for (int j = start; j < end; j++) {
			if (arr[j] <= p) { // 배열의 첫 요소부터 비교시작, 배열의 요소가 p보다 작다면 교환
				int temp = arr[++s];
				arr[s] = arr[j];
				arr[j] = temp;
				count++;
				if (count == k) {
					for (int e : arr) {
						System.out.print(e + " ");
					}
					break;
				}
			}
		}
		// 아직 start가 end까지 도달하지 못함
		if (s + 1 != end) {
			int temp = arr[s + 1];
			arr[s + 1] = arr[end];
			arr[end] = temp;
			count++;
			if (count == k) {
				for (int e : arr) {
					System.out.print(e + " ");
				}
			}
		}
		return s + 1;
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
		quickSortTemp(A, K);

		if(count < K) {
			System.out.println("-1");
		}

	}
}
