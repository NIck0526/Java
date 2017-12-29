package array.primitive.test;

public class ScoreArrayTest3 {
	public static void main(String[] args) {
		int sum = 0;
		int avg = 0;
		int[] score = {90,50,46,88,79};
		
		// 1. for문을 이용해서 점수의 총합을 구하세요.
		// i<score.length  <-- 요문장은 배열의 사이즈임. == i<5;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}//for
		System.out.println(" TOTAL SCORE :: "+sum+" 점");
		
		// 2. 총점을 이용해서 평균점수를 출력하세요.
		
		avg = sum/score.length; // /5 는 5나누기
		System.out.println(" AVG SCORE :: "+avg+" 점");
		
		// 3. 평균 이하점들을 출력하고, 펴윤 이하점수를 받은
		// 사람의 인원수도 함께 출력
		int count = 0;
		for(int i=0; i<score.length; i++) {
			
			if(score[i]<=avg) {
				count++;
			System.out.println(score[i]);
			}
		}//for
		System.out.println(" 평균 점수 이하점 인원수 ::"+count);
		System.out.println(score);
		
	}//main

}//class
