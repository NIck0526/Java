package array.primitive.test;

public class IdolFanAgeTest3 {


	public static void main(String[] args) {
		
		int[] idol = {10,20,30,40,50};
		int sum = 0;
		int avg = 0;
		// 1. idol �ι�° ĭ�� ���ɴ븦 60���� ����
		idol[1] = 60;
		// 2. for���� �̿��ؼ� idol ��ü ���ɴ븦 ���
		for(int i=0; i<idol.length; i++) {
			System.out.println(idol[i]);
		}
		
		
		// 3. 30�븦 �ʰ��ϴ� �� �������� ���
		for(int i=0; i<idol.length; i++) {
			if(idol[i]>30) {
				System.out.println(idol[i]);
				}	
		}
				
		// 4. idol ��� ���ɴ븦 ���
		for(int i=0; i<idol.length; i++) {
			sum += idol[i];
		}
			/*
			 * avg = sum/idol.length;
			 * System.out.println("==== �� ��� ���ɴ� ===\n "+avg);
			 */
		System.out.println("�� ��� ���ɴ�"+sum/idol.length);
		
		
	}
	

}
