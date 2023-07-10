package Java_Cote;

/*      <문제>
        오늘도 서준이는 선택 정렬 수업 조교를 하고 있다. 아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.
        N개의 서로 다른 양의 정수가 저장된 배열 A가 있다.
        선택 정렬로 배열 A를 오름차순 정렬할 경우 K 번 교환이 발생한 직후의 배열 A를 출력해 보자.
        크기가 N인 배열에 대한 선택 정렬 의사 코드는 다음과 같다.

        selection_sort(A[1..N]) { # A[1..N]을 오름차순 정렬한다.
            for last <- N downto 2 {
                A[1..last]중 가장 큰 수 A[i]를 찾는다
                if (last != i) then A[last] <-> A[i]  # last와 i가 서로 다르면 A[last]와 A[i]를 교환
            }
        }
        <입력>
        첫째 줄에 배열 A의 크기 N(5 ≤ N ≤ 10,000), 교환 횟수 K(1 ≤ K ≤ N)가 주어진다.
        다음 줄에 서로 다른 배열 A의 원소 A1, A2, ..., AN이 주어진다. (1 ≤ Ai ≤ 109)

        <출력>
        K 번 교환이 발생한 직후의 배열 A를 한 줄에 출력한다. 교환 횟수가 K 보다 작으면 -1을 출력한다.

        <예제입력>
        5 2
        3 1 2 5 4

        <예제출력>
        2 1 3 4 5

        */


import java.util.Scanner;

public class baek_23882_선택정렬2 {
    public static void main(String[] args) {

        //입력받기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        //배열선언
        int[] A = new int[N];

        // 변수선언
        int max = 0;
        int temp = 0;
        int count = 0;
        //배열값 입력받기
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        //선택정렬 알고리즘(뒤에서 부터 정렬해야함)
        for (int i = N - 1; i >= 0; i--) {
            max = i;
            for (int j = 0; j < i; j++) {
                if (A[j] > A[max]) max = j;
            }
            // swap
            if (A[max] > A[i]) {
                temp = A[i];
                A[i] = A[max];
                A[max] = temp;
                count++;
            }
            if (count >= K) break;
        }

        //출력하기
        if (count < K) {
            System.out.print(-1);
        } else {
            for (int i = 0; i < N; i++) {
                System.out.print(A[i] + " ");
            }
        }


    }
}
