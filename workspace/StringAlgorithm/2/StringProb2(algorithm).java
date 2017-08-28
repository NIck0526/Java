public class StringProb2 {
	public static void main(String[] args) {
		System.out.println(spaceTrim("Java  Program        Language"));
		System.out.println(spaceTrim("Structured Query     Language"));
		System.out.println(spaceTrim("Servlet & JSP"));
	}

	private static char[] spaceTrim(String string) {
		// 구현하세여..
		char[] c1 = string.toCharArray();
		char[] c2 = new char[c1.length];
		int index = 0;
		for(int i=0; i<c1.length; i++){
			if(c1[i] == ' ' && c1[i+1]==' ')
				continue;
			else{
				c2[index] = c1[i];
				index++;
			}	
		}
		return c2;
	}
}
