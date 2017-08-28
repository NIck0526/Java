import java.util.StringTokenizer;

public class StringProb2 {
	public static void main(String[] args) {
		System.out.println(spaceTrim("Java  Program        Language"));
		System.out.println(spaceTrim("Structured Query     Language"));
		System.out.println(spaceTrim("Servlet & JSP"));
	}
//StringTokenizer�� �������� ������ �ϳ��� �ν��Ѵ�.
//split()�� �������� ������ ������ �ν��Ѵ�.
	private static char[] spaceTrim(String string) {
		// �����ϼ���..
		StringTokenizer st = new StringTokenizer(string);
        StringBuffer sb=new StringBuffer();
        while(st.hasMoreTokens())
        	sb.append(st.nextToken()+" ");   
        
        String ss=new String(sb.substring(0, sb.length()-1)); 
		return ss.toCharArray();

	}
}
