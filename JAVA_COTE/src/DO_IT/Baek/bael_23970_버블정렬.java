package DO_IT.Baek;

import java.util.Scanner;

public class bael_23970_버블정렬 {

	public static boolean isp(int A[], int B[], int N) {
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (A[i] != B[i]) {
				break;
			} else
				count++;
		}

		if (count == N) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {

		// 입력받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		// 배열 및 변수
		int[] A = new int[N];
		int[] B = new int[N];
		int temp = 0;
		boolean r = false;
		// A 입력받기
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		// B 입력받기
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		// 초기검사
		if (isp(A, B, N)) {
			System.out.print(1);
			return;
		}
		// 버블정렬 알고리즘
		for (int i = 0; i < N - 1; i++) {
			r = false;
			for (int j = 0; j < N - 1 - i; j++) {
				if (A[j] > A[j + 1]) {
					temp = A[j + 1];
					A[j + 1] = A[j];
					A[j] = temp;
					if (isp(A, B, N)) {
						r = true;
					}
				}
			}
			if (r = true)
				break;
		}
		// 출력
		if (r) {
			System.out.print(1);
		} else
			System.out.print(0);
	}
}