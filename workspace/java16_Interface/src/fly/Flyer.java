package fly;
/*
 * �������̽� �������
 * 1.public abstract method
 * 2.��� public static final
 */
//super, parent
//super class�� �ٸ����� �ڽİ�ü ������ Type���μ��� ����.
public interface Flyer {
	char color = 'B'; // public static final �� ������ �����Ǿ��ִ�.
	public static final int DEFAULT_SPEED = 1024;
	public abstract String fly();
	abstract public void take_off();
	void land(); //interface�ȿ� �޼ҵ�� ������ public abstract���� �����ȴ�.
	

}
