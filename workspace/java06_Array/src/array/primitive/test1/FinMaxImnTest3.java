package array.primitive.test1;
/*
 *  최대값 최소값 구하는 기술....을 생각해봅시다.
 */
public class FinMaxImnTest3 {

	public static void main(String[] args) {
		int [] score = {79,88,91,33,100,55,95};
		
		//for문을 사용해서 이 중에서 가장 큰 값을 찾아서 출력
		
		int max = score[0];
		int min = score[0];
		
		/*
		for(int i =1; i<score.length; i++) {
			if(max<score[i])
				max = score[i];
		} // 반복적인 것임. max=79, 79와 88 비교 88이큼, 88은 max가 됨
		// 88이랑 91비교, 91이큼, 91이 max가 됨, ~~반복~~
		*/
		
		//향상된 for문
		//index기능이 없다.
		
		for(int i : score) {
			if(max<i)
				max = i;
		}
		
		for(int i : score) {
			if(min>i)
				min = i;
		}
		
		/*for(int i=0; i<score.length; i++) {
			max = Integer.max(max, score);
			} Integer.max 사용부분
		*/
		
		System.out.println("최대값 :: "+max);
		System.out.println("최소값 :: "+min);
		
	}

}
