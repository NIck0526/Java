package array.primitive.test1;
/*
 * Array 특징
 * ::
 *  1. Class DataType이 주어져 있지 않다.
 *     Return 해주는 length를 반드시 알고 있자
 *  2. Resizing을 할 수 없다.
 *     만약에 사이즈를 새로 잡으면 새로운 배열이 생성된다.(객체생성)
 *     이전에 3칸짜리 배열은 gc(쓰레기 객체)의 대상이 된다.
 */
public class ResizingArrayTest1 {

	public static void main(String[] args) {
		// 1. 3칸 짜리 배열을 생성...
		int [] i = new int[3];
		
		System.out.println("3칸짜리 배열 ::"+i);
		
		// 2. Resizing - 안됨
		
		i = new int[7];
		System.out.println("7칸 짜리 배열 ::"+i);
				

	}

}
