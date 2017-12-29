package array.primitive.test1;
/*
 * Array�� Resizing �� �ȵ�����
 * size�� �ٸ� Array�� ����Ÿ�� ������ �� �� �ִ�.
 * ::
 * 1,2,3,99,88,77,66,55,44,33
 * System.arraycopy() --> �迭�� ������ ������ �� �� �ִ�.
 * for �̿��ؼ� target�� ����ϸ� ����Ÿ�� ������ ������ �ɷ� ���;��Ѵ�. 
 */

public class ArrayCopyTest2 {
	public static void main(String[] args) {
		int[] target = {1,2,3,4,5,6,7,8,9,10};
		int[] source = {99,88,77,66,55,44,33};
		
		//system.arraycopy(ī�Ǵ��, ��������, 
		// �ҷ����� ���, �ҷ����´���� ��ȯ ����, 
		// ī�Ǵ���� ����������)
		
		System.arraycopy(source, 0, target, 3, 5);
		for(int i = 0; i < target.length; i++) {
			System.out.print(target[i]+" ,");
		}
		
	}//main

}//class
