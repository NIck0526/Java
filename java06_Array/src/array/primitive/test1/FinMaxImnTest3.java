package array.primitive.test1;
/*
 *  �ִ밪 �ּҰ� ���ϴ� ���....�� �����غ��ô�.
 */
public class FinMaxImnTest3 {

	public static void main(String[] args) {
		int [] score = {79,88,91,33,100,55,95};
		
		//for���� ����ؼ� �� �߿��� ���� ū ���� ã�Ƽ� ���
		
		int max = score[0];
		int min = score[0];
		
		/*
		for(int i =1; i<score.length; i++) {
			if(max<score[i])
				max = score[i];
		} // �ݺ����� ����. max=79, 79�� 88 �� 88��ŭ, 88�� max�� ��
		// 88�̶� 91��, 91��ŭ, 91�� max�� ��, ~~�ݺ�~~
		*/
		
		//���� for��
		//index����� ����.
		
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
			} Integer.max ���κ�
		*/
		
		System.out.println("�ִ밪 :: "+max);
		System.out.println("�ּҰ� :: "+min);
		
	}

}
