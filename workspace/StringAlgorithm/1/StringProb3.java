public class StringProb3 {
	public static void main(String[] args) {
		System.out.println("<< ù ��° �޽��� >>");
		handleMessage("PROD-00001:iPhone4:940000:4:����");
		System.out.println("<< �� ��° �޽��� >>");
		handleMessage("PROD-00002:������S:960000:�Ｚ");
	}

	private static void handleMessage(String string) {
		
		// �����ϼ���...
		String str[]=string.split(":");
		if(str.length==5){
			System.out.println("��ǰ���̵�:"+str[0]);
			System.out.println("��ǰ��:"+str[1]);
			System.out.println("����:"+str[2]);
			System.out.println("����:"+str[3]);
			System.out.println("������:"+str[4]);
		}else{
			System.out.println("�޼��� ������ �߸��Ǿ����ϴ�.");
			System.out.println("�޼��� ������ ��ǰ���̵�:��ǰ��:����:����:������ �����̾�� �մϴ�.");
		}
	}
}
