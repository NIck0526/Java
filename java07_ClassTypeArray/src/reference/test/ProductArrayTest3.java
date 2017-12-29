package reference.test;

import reference.vo.ProductVO;

public class ProductArrayTest3 {
	public static void main(String[] args) {
		//1. ProductVO 타입의 배열 생성... 사이즈 4 ... pros
		
		ProductVO [] pros = {
				new ProductVO(111, "공기방울 세탁기", "대우", 450000),
				new ProductVO(222, "방구방구 세탁기", "삼성", 3500000),
				new ProductVO(333, "드럼 세탁기", "엘지", 4000000),
				new ProductVO(111, "워시워시 세탁기", "넥센", 754443)
		};
		
	// 1. 향상된 for문을 사용해서 각 제품들의 이름만 출력
		System.out.println("===========Model===========");
		for(ProductVO vo : pros) {
			System.out.println(vo.getModel());
		}
	// 2. 가격이 100만원 이상인 제품만 출력
		System.out.println("============High Price========");
		for(ProductVO vo : pros) {
			if(vo.getPrice()>1000000)
				System.out.println(vo.getModel()+vo.getPrice());
		}
	// 3. 제조사가 대우인 상품이 있다면 해당 상품의 이름과 일렬번호 출력
		System.out.println("============ MAKER :  대  우 ===========");
		for(ProductVO vo : pros) {
			if(vo.getMaker().equals("대우"))
				System.out.println(vo.getModel()+vo.getSerialNum());
		}
		
		
	}

}
