package pizza.parent;
/*
 * Pizz�μ��� �������� field�� method�� �����ϰ�
 * �پ��� �� �� �ִ� �Ѥ�¡���� ����� �߻����� template�� ����
 */

abstract public class Pizza {
	private int price;
	private String storeName;
	
	
	public Pizza(int price, String storeName) {
				this.price = price;
		this.storeName = storeName;
	}

	//public Pizza() {}

	
	
	
	//���ڸ� ����� ���
	
	public void dough() {
		System.out.println("���� ���װ� �Բ� ���츦 �����");
	}
	
	public void bake() {
		System.out.println("180������ ��������.");
	}
	
	//abstract method
	public abstract void topping();
	
	public void cut() {
		System.out.println("8������� �߶󳽴�");
	}
	
	public void boxing() {
		System.out.println("���̻��ڿ� ��´�");
	}

	//�������� ����� �ѹ��� �ٷ�� ����� �߰�
	public void makePizza() {
		dough();
		topping();
		bake();
		cut();
		boxing();
	}
	
	
	public String toString() {
		return storeName+" , "+price+" ��";
	}
}
