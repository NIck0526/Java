package array.primitive.test;
/*
 * Array
 * ::
 * ���� ����Ÿ Ÿ���� ������ �������� �ٸ� ������
 * �ϳ��� ������ ���ؼ� �ѹ濡 ó���Ǵ� ��
 */

public class IntArrayTest1 {

	public static void main(String[] args) {
	//1. �迭����
	int[]i;
	
	//2.�迭 ���� : (new ���� | size ���)
	i = new int[3];
	
	System.out.println("====������ �ʱ�ȭ ���� ====");
	for(int arr=0; arr<3; arr++) 
		System.out.print(i[arr]+" ");
	//for
	
	//3. �ʱ�ȭ
	i[0] = 11;
	i[1] = 22;
	i[2] = 33;
	
	System.out.println("\n ====����� �ʱ�ȭ ����====");
	for(int arr=0; arr<3; arr++)
		System.out.print(i[arr]+" ");
	
	System.out.println("\n Array ��ü ::"+i);//�� ��������??

	}//main

}//class
