import java.util.StringTokenizer;

public class StringProb1 {
	public static void main(String[] args) {
		System.out.println(makeInitial("Java Data Base Conectivity"));
		System.out.println(makeInitial("Java Server Pages"));
		System.out.println(makeInitial("Enterprise Java Beans"));
	}

	private static String makeInitial(String fullName) {
		//구현하세여...
		StringBuffer sb= new StringBuffer();
		StringTokenizer st = new StringTokenizer(fullName);
		while (st.hasMoreElements()) {
			sb.append(st.nextToken().substring(0, 1));
		}
		
		String s =sb.toString();
		return s;
	}
}
