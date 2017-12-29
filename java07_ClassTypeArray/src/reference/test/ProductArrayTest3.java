package reference.test;

import reference.vo.ProductVO;

public class ProductArrayTest3 {
	public static void main(String[] args) {
		//1. ProductVO Ÿ���� �迭 ����... ������ 4 ... pros
		
		ProductVO [] pros = {
				new ProductVO(111, "������ ��Ź��", "���", 450000),
				new ProductVO(222, "�汸�汸 ��Ź��", "�Ｚ", 3500000),
				new ProductVO(333, "�巳 ��Ź��", "����", 4000000),
				new ProductVO(111, "���ÿ��� ��Ź��", "�ؼ�", 754443)
		};
		
	// 1. ���� for���� ����ؼ� �� ��ǰ���� �̸��� ���
		System.out.println("===========Model===========");
		for(ProductVO vo : pros) {
			System.out.println(vo.getModel());
		}
	// 2. ������ 100���� �̻��� ��ǰ�� ���
		System.out.println("============High Price========");
		for(ProductVO vo : pros) {
			if(vo.getPrice()>1000000)
				System.out.println(vo.getModel()+vo.getPrice());
		}
	// 3. �����簡 ����� ��ǰ�� �ִٸ� �ش� ��ǰ�� �̸��� �ϷĹ�ȣ ���
		System.out.println("============ MAKER :  ��  �� ===========");
		for(ProductVO vo : pros) {
			if(vo.getMaker().equals("���"))
				System.out.println(vo.getModel()+vo.getSerialNum());
		}
		
		
	}

}
