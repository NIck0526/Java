package string.step1.test;

import java.util.StringTokenizer;

/*
 *  String Class
 *  ::
 *  ������ �ʴ�(immutable) ���ڿ� ����� �ٷ�� Ŭ����
 *  ��Ʈ�� Ŭ�������� �����ϴ� �޼ҵ带 �̿��ؼ� ���ڿ���
 *  ����� ������ ����ؼ� ���ڿ� ��ü�� ������.
 *  ���ڿ��� ���� �� ������ Heap�� ��ü�� ��� ��������� ������
 *  ���ڿ� ����, ������ ����� ��� String�� ����ϸ�
 *  �޸� ȿ������ ����߸��� ����� �ʷ��Ѵ�.
 *  ::
 *  StringBuffer Ȥ��(StringBuilder)����� ����.
 */
public class StringExamTest {

	public static void main(String[] args) {
		System.out.println("========length(), replace(), substring()==========");
		String str1="������     ";//5
		String str2="������ ";//1
		String str="������";//0
		System.out.println("1. str��ü�� ���ڿ� ���� : "+str.length());
		
		String str3 = str.replace('��','��');
		System.out.println("2. �������� '��'--> '��'�� ���� : "+str);
		System.out.println("2. �������� '��'-->'��'�� ���� : "+str3);

		//'����'�� ��� �ǵ���
		String str4 = str.substring(1,3);// �����ϴ� �ε������� But, ������ �ε����� �������� ����!!!!!!!
		System.out.println("3. ������ ��� :: "+str4);
		
		System.out.println(str);//���ڿ� ����̱⿡ �ƹ��� �ٲ㵵 ó�� �״��.
		
		System.out.println("========trim() :: (��,�� ���鸸 ����, �߰��� x) ������ ���� =========");
		String s1 ="���ӽ�������";
		String s2 =" ���ӽ� ������";
		String s3 ="���ӽ� ������ ";
		if(s1.equals(s2))
			System.out.println("Same Data1??");
		if(s1.equals(s2.trim()))
			System.out.println("Same Data2..");
		if(s2.trim().equals(s3.trim()))//(��,�� ���鸸 ����, �߰��� x)
			System.out.println("Same Data3..");
		
		
		
		System.out.println("==========s1.equals(s2)========");
		if(s1.equals(s2.replace(" ", "")))
			System.out.println("���� ����!!!!!!!!!!");
		
		
		System.out.println("\n==== indexOf(), charAt()=====");
		System.out.println("\n==== s1���� '��'�� �ش��ϴ� index�� ���Ϲ޾� ��� ::");
		int temp = s1.indexOf("��");
		System.out.println(temp);
		
		System.out.println("\n==== s1���� index 3�� �ش��ϴ� char�� ��� ::");
		char c1 = s1.charAt(3);
		System.out.println(c1);
		
		/*
		 *  �̹����� ������ �������� ���ڸ� ������ ���� �ƴ϶�
		 *  , / �̷� �͵��� �������� ���ڿ��� ������ ����� �˾ƾ� �Ѵ�.
		 */
		System.out.println("============ split() ============");
		String star = "������, ��ȿ��, ����, ���, ������, �¾�";
		
		String [] starArr = star.split(","); // , �� �������� ����
		for(String s : starArr) {
			System.out.println(s);
		}
		
		System.out.println("\n=========== StringTokenizer ===========");
		StringTokenizer st = new StringTokenizer(star, ",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("\n============Self Test===========");
		String ss="������ �Ҵ� �����ú� �̾�Ĺ �轼ī��     �ڸ�";
		/*
		 * split() - space�� ��� �ν��Ѵ�.
		 *  
		 * |
		 * 
		 *  StringTokenizer() - space�� �ƹ��� �����൵ �ϳ��� �ν�.
		 */
		
		String [] ssArr = ss.split(" ");
		for(String sss : ssArr) {
			System.out.println("==Split=="+sss);
		}
		StringTokenizer sst = new StringTokenizer(ss);
		while(sst.hasMoreTokens()) {
			System.out.println("==StringTokenizer=="+sst.nextToken());
		}
		
		System.out.println(" ");
		System.out.println("=============starsWith(), endsWith()===========");
		String start ="���� ���� �޴��� ���� �Ͻ� �ǰ���?";
		System.out.println("startsWith() :: "+start.startsWith("����"));
		System.out.println("startsWith():: "+start.startsWith("���� ����"));
		System.out.println("endsWith() :: "+start.endsWith("��?"));
		
		System.out.println(" ");
		System.out.println("============toUpperCase(), toLowerCase()===========");
		String lower = "james gosling";
		String upper = "JAMES GOSLING";
		
		System.out.println("JAMES GOSLING ���� ���� :: "+lower.toUpperCase());
		System.out.println(lower.equalsIgnoreCase(upper));
		
	}

}