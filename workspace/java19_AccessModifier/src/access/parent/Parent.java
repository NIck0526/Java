package access.parent;
/*
 * ������������ ������ �˾ƺ��� ������ �ۼ�
 * ������ �ʵ��� access modifier�� ���� �ٸ��� �ְ�
 * � ���������� ������ ����ϴ����� Ȯ��
 * 
 * protected�� �� �ʿ������� �Բ� ���.
 */
public class Parent {
	public String publicTest = "publicTest";
	protected String protectedTest= "protectedTest" ;
	String defaultTest = "defaultTest";
	private String privateTest = "privateTest";
	
	public Parent() {}
	public void access() {
		System.out.println("Access Modifier Test....");
		
	}
}
