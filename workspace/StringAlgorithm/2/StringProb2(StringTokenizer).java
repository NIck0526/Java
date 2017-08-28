import java.util.StringTokenizer;

public class StringProb2 {
	public static void main(String[] args) {
		System.out.println(spaceTrim("Java  Program        Language"));
		System.out.println(spaceTrim("Structured Query     Language"));
		System.out.println(spaceTrim("Servlet & JSP"));
	}

	private static char[] spaceTrim(String string) {
		// 구현하세여..
		StringBuffer sb= new StringBuffer();
		StringTokenizer st = new StringTokenizer(string);
		while (st.hasMoreElements()) {
			sb.append(st.nextToken()+" ");
		}		
		String s=sb.toString();
		char []c =s.toCharArray();
		return c;
	}
}
