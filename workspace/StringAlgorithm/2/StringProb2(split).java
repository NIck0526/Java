public class StringProb2 {
	public static void main(String[] args) {
		System.out.println(spaceTrim("Java  Program        Language"));
		System.out.println(spaceTrim("Structured Query     Language"));
		System.out.println(spaceTrim("Servlet & JSP"));
	}

	private static char[] spaceTrim(String string) {
		String[ ] temp = string.split(" ");
		String trimedStr = temp[0];
		
		for (int i = 1; i < temp.length; i++) {
			if(!temp[i].equals("")){				
				trimedStr += " " + temp[i];				
			}			
		}//for
		return trimedStr.toCharArray();
	}
}
