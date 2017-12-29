package props.test;

import java.util.Enumeration;
import java.util.Properties;

/*
 * JDK��ġ
 * JREȯ��
 * VM���� ȭ�溯������ OS(System)���� ž�簡 �ȴ�.
 * � ȯ�溯������ ž�簡 �Ǵ��� ���δ� ���
 * ::
 * Collection�� ���������� �����ϸ� ����� �ʰ� ������ �� �ִ�.
 * �ڷ�(����Ÿ)�� �����ϴ� �������̽����� Ư¡
 * �ڹٴ� C�� �޸� �ڷᱸ������ ����
 * ��ſ� Collection API�� �����Ѵ�.
 */
public class PropertiesTest {

	public static void main(String[] args) {
		Properties p = System.getProperties();//calling -> Worker-> ������ calling�������� return
		
		Enumeration en = p.propertyNames();
		
		while(en.hasMoreElements()) {
			String key = (String)en.nextElement();
			String value = p.getProperty(key);
			System.out.println(key+"====================="+value);
		}
	}

}
