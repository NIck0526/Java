package array.primitive.test;

public class IdolFanAgeTest3 {


	public static void main(String[] args) {
		
		int[] idol = {10,20,30,40,50};
		int sum = 0;
		int avg = 0;
		// 1. idol 두번째 칸의 연령대를 60으로 변경
		idol[1] = 60;
		// 2. for문을 이용해서 idol 전체 연령대를 출력
		for(int i=0; i<idol.length; i++) {
			System.out.println(idol[i]);
		}
		
		
		// 3. 30대를 초과하는 팬 연령층을 출력
		for(int i=0; i<idol.length; i++) {
			if(idol[i]>30) {
				System.out.println(idol[i]);
				}	
		}
				
		// 4. idol 평균 연령대를 출력
		for(int i=0; i<idol.length; i++) {
			sum += idol[i];
		}
			/*
			 * avg = sum/idol.length;
			 * System.out.println("==== 팬 평균 연령대 ===\n "+avg);
			 */
		System.out.println("팬 평균 연령대"+sum/idol.length);
		
		
	}
	

}
