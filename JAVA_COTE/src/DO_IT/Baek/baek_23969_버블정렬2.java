package DO_IT.Baek;

import java.util.Scanner;

/*      <문제>
        오늘도 서준이는 버블 정렬 수업 조교를 하고 있다.
        아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.
        N개의 서로 다른 양의 정수가 저장된 배열 A가 있다.
        버블 정렬로 배열 A를 오름차순 정렬할 경우 K 번 교환이 발생한 직후의 배열 A를 출력해 보자.
        크기가 N인 배열에 대한 버블 정렬 의사 코드는 다음과 같다

        bubble_sort(A[1..N]) { # A[1..N]을 오름차순 정렬한다.
                for last <- N downto 2
        for i <- 1 to last - 1
        if (A[i] > A[i + 1]) then A[i] <-> A[i + 1]  # 원소 교환
        }
        <입력>
        첫째 줄에 배열 A의 크기 N(5 ≤ N ≤ 10,000), 교환 횟수 K(1 ≤ K ≤ N2)가 주어진다.
        다음 줄에 서로 다른 배열 A의 원소 A1, A2, ..., AN이 주어진다. (1 ≤ Ai ≤ 109)

        <출력>
        K 번 교환이 발생한 직후의 배열 A를 한 줄에 출력한다. 교환 횟수가 K 보다 작으면 -1을 출력한다.

        <예제입력>
        6 10
        4 6 5 1 3 2

        <예제출력>
        1 3 2 4 5 6


               */
public class baek_23969_버블정렬2 {
    public static void main(String[] args) {

        //입력받기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        // 배열 및 변수
        int[] A = new int[N];
        int[] B = new int[N];
        int temp = 0, count = 0;
        //A 입력받기
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        //버블정렬 알고리즘
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (count >= K) {
                    break;
                } else {
                    if (A[j] > A[j + 1]) {
                        temp = A[j + 1];
                        A[j + 1] = A[j];
                        A[j] = temp;
                        count++;
                    }
                }
            }
        }
        //출력
        if (K <= count) {
            for (int i = 0; i < N; i++) {
                System.out.print(A[i] + " ");
            }
        } else
            System.out.print(-1);
    }
}