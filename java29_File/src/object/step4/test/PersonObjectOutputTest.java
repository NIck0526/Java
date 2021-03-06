package object.step4.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*
 * =============== 직렬화 코드 =============
 * 
 * Person 객체의 필드 값을 sink(파일 : person.obj)쪽으로 날리는 로직을 작성
 * 1. Stream 생성
 * 	  ObjectOutputStream | FileOutputStream
 *
 * 2. 출력한다... WriteObject(person);
 * 3. 자원을 닫는다.
 * 
 */
public class PersonObjectOutputTest {

	public static void main(String[] args) throws Exception {
		String fileName = "c:\\objFile\\person.obj";
		File f = new File(fileName);
		f.getParentFile().mkdirs();
		
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		System.out.println("1. Stream 생성....");
		
		Person p = new Person("홍길동", 20, "1234", "여의도");
		
		oos.writeObject(p);
		System.out.println("2.writeObject()  calling....");
		System.out.println("3. person.obj 파일에 person의 정보가 저장됬습니다...");
		System.out.println("4. 정보를 확인해보려면 다시 역직렬화 해서 출력해봅니다...");
		
		oos.close();
	}

}
