package DO_IT.ARRAY;

public class Running_Time_Test {

	public static void main(String[] args) {
		

		// 실행시간 테스트
		double before_Time_2 = System.currentTimeMillis();
		int[][] time_arr = new int[10001][10001];
		int[][] time2_arr = new int[10001][10001];
			
		int count = 0;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 10000; j++) {
				for(int j2 = 0; j2 < 10000; j2++) {
					if(i == 0) time_arr[j][j2] = count++;
					if(i == 1) time2_arr[j][j2] = count++;
				}
			}
			count = 0;
				
		}
		

/*		
		for(int j = 0; j < 10000; j++) {
			for(int j2 = 0; j2 < 10000; j2++) {
				time_arr[j][j2] = count++;
			}
		}
		
		count = 0;
		
		for(int j = 0; j < 10000; j++) {
			for(int j2 = 0; j2 < 10000; j2++) {
				time2_arr[j][j2] = count++;
			}
		}
*/		
		
		

		//실행시간 출력
		double after_Time_2 = System.currentTimeMillis();
		double secDiff_Time_2 = (after_Time_2 - before_Time_2);
		System.out.println("시간차이 : "+ secDiff_Time_2);
		
	}
			
}
