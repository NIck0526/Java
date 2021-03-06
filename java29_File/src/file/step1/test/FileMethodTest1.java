package file.step1.test;

import java.io.File;

/*
 * IO에서 가장 빈번하게 사용되는 File 클래스
 * File 클래스에서 제공하는 기본적인 기능을 살펴 보는 로직
 * ::
 * getName() :: 확장자를 포함한 파일이름이 리턴
 * getPath(), getAbsolutePath() :: 경로를 포함한 파일명
 * String getParent(), FIle getParentFile() :: 경로를 파악
 * mkdir(), mkdirs() :: 존재하지 않는 경로를 실질적으로 생성
 */
public class FileMethodTest1 {

	public static void main(String[] args) {
		//File을 의미하는 정보는 디렉토리 + 파일명(확장자를 포함한)
		File f = new File("C:\\Intel"+File.separator+"lkm\\javaPro\\eclipse\\workspace\\java29_File\\src\\file\\step1\\test\\FileMethodTest1.java");
		File file = new File("C:\\test\\a.txt");
		String fileName =f.getName();
		System.out.println("getName() :: "+fileName);
		
		//FileMethodTest1
		//.의 위치를 알아서 substring()을 사용
		int position = fileName.indexOf('.');
		System.out.println("1. 확장자를 제외한 파일명 :: "+fileName.substring(0,position));
		System.out.println("2. 확장자만 출력 :: "+fileName.substring(position+1));
		
		//경로
		System.out.println(" getAbsolutePath() :: 파일의 절대경로 "+f.getAbsolutePath());
		System.out.println(" getPath() :: 파일을 포함한 경로"+f.getPath());
		
		System.out.println("getParent() ::"+f.getParent());
		//파일이 있는 디렉토리
		System.out.println("getParentFile() ::"+f.getParentFile());
		
		
	}

}
