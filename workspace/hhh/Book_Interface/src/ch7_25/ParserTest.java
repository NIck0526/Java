package ch7_25;

import javax.swing.text.html.parser.Parser;

public class ParserTest {
	public abstract void parse(String fileName);
	

}

class ParseManager{
	
	public static Parseable getParser(String type) {
		if(type.equals("XML")){
			 return new XMLParser();
		} else {
		Parseable p = new HTMLParser();
		return p;
		
		}
	}
}

class XMLParser implements Parseable {
	public void parse(String fileName) {
		System.out.println(fileName+"-XML parsing completed.");
		
	}
}
	
class HTMLParser implements Parseable {
	public void parse(String fileName) {
		System.out.println(fileName+"HTML parsing completed.");
	}
}

class ParseTest{
	public static void main(String[] args) {
		Parseable parse = ParseManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParseManager.getParser("HTML");
		parser.parse("document2.html")
		
	}
}