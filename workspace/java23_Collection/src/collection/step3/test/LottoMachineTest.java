package collection.step3.test;
/*
 * Lotto Number를 생성
 * ::
 * 6개의 번호
 * 1~45번 중에서 임의의 번호가 뽑혀진다.
 * 이중에서 동일한 번호는 없어야 한다.
 * 번호는 순서대로 정렬 되어져야 한다.
 * ::
 * TreeSet
 * 33, 6, 2, 17, 7, 42
 * 2, 6, 7, 17, 33, 42
 */

import java.util.TreeSet;

class LottoMachineService{
	public TreeSet<Integer> createLottoNumber(){
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		while(set.size()<6) {
			int number = (int)(Math.random()*45)+1;
			set.add(number);
		}
		
		
		/*
		 * random() 사용해서 1_45까지의 정수가 나오도록
		 * 정수가 리턴되면 그 값을 set에 저장
		 * set의 사이즈가 6보다 작을때 까지 저장.
		 */
		return set;
	}
}
public class LottoMachineTest {
	public static void main(String[] args) {
		LottoMachineService service = new LottoMachineService();
		TreeSet<Integer> set = service.createLottoNumber();
		System.out.println("추첨 번호는 :: "+set);
	}

}
