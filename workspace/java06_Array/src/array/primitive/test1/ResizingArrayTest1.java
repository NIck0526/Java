package array.primitive.test1;
/*
 * Array Ư¡
 * ::
 *  1. Class DataType�� �־��� ���� �ʴ�.
 *     Return ���ִ� length�� �ݵ�� �˰� ����
 *  2. Resizing�� �� �� ����.
 *     ���࿡ ����� ���� ������ ���ο� �迭�� �����ȴ�.(��ü����)
 *     ������ 3ĭ¥�� �迭�� gc(������ ��ü)�� ����� �ȴ�.
 */
public class ResizingArrayTest1 {

	public static void main(String[] args) {
		// 1. 3ĭ ¥�� �迭�� ����...
		int [] i = new int[3];
		
		System.out.println("3ĭ¥�� �迭 ::"+i);
		
		// 2. Resizing - �ȵ�
		
		i = new int[7];
		System.out.println("7ĭ ¥�� �迭 ::"+i);
				

	}

}
