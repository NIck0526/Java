package file.step2.test;

import java.io.File;

class FileSelfExam{
	public void createDirAnFile(String path) throws Exception{
		/*
		 * 1. 디렉토리 생성
		 * 2. 파일 생성
		 * 3. 파일의 이름을 콘솔로 출력
		 */
		System.out.println("디렉토리 생성");
		File dir1 = new File(path);
		System.out.println("1. 디렉토리 생성 :: "+dir1.getParentFile().mkdirs());
		System.out.println("2. 파일 생성 :: " +dir1.createNewFile());
		System.out.println("3. 파일이름 출력 :: "+dir1.getName());
		
		
	}
}

public class CreateDirAndFileTest {
	public static void main(String[] args) throws Exception {
		FileSelfExam exam = new FileSelfExam();
		exam.createDirAnFile("c:\\"+File.separator+"filexam"+File.separator+"test1.mp3");
		exam.createDirAnFile("c:\\"+File.separator+"filexam"+File.separator+"note.txt");
		exam.createDirAnFile("c:\\"+File.separator+"filexam"+File.separator+"greeting.avi");
		
	}

}
