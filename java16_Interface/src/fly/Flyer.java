package fly;
/*
 * 인터페이스 구성요소
 * 1.public abstract method
 * 2.상수 public static final
 */
//super, parent
//super class와 다른점은 자식객체 생성시 Type으로서만 존재.
public interface Flyer {
	char color = 'B'; // public static final 이 무조건 생략되어있다.
	public static final int DEFAULT_SPEED = 1024;
	public abstract String fly();
	abstract public void take_off();
	void land(); //interface안에 메소드는 무조건 public abstract으로 지정된다.
	

}
