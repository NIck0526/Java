package file.step1.test;

import java.io.File;

public class FileMethodTest2 {

	public static void main(String[] args) {
		File dir1 = new File("c:\\filetest\\step1\\code");
		File dir2 = new File("c:\\filetest2");
		
		System.out.println("디렉토리가 생성되었나요? "+dir1.isDirectory());
		
		dir1.mkdirs();
		dir2.mkdir();
		
		System.out.println("디렉토리가 생성되었나요 ?"+dir1.isDirectory());
		System.out.println("==== getParent() | getParentFile() ====");
		File fp =dir1.getParentFile();
		System.out.println(fp);
		System.out.println("getParent() :: "+dir1.getParent());
		
		
		System.out.println("폴더안에가 파일인지 아닌지 구분해서 찾기");
		File[] files = fp.listFiles();
		for(File f : files) {
			if(f.isFile())
				System.out.println(f.getName());
			else
				System.out.println(f.getPath());
		}
		
	}

}
