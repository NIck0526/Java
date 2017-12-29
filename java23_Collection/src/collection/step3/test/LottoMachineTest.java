package collection.step3.test;
/*
 * Lotto Number�� ����
 * ::
 * 6���� ��ȣ
 * 1~45�� �߿��� ������ ��ȣ�� ��������.
 * ���߿��� ������ ��ȣ�� ����� �Ѵ�.
 * ��ȣ�� ������� ���� �Ǿ����� �Ѵ�.
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
		 * random() ����ؼ� 1_45������ ������ ��������
		 * ������ ���ϵǸ� �� ���� set�� ����
		 * set�� ����� 6���� ������ ���� ����.
		 */
		return set;
	}
}
public class LottoMachineTest {
	public static void main(String[] args) {
		LottoMachineService service = new LottoMachineService();
		TreeSet<Integer> set = service.createLottoNumber();
		System.out.println("��÷ ��ȣ�� :: "+set);
	}

}
