package kosta.service;

import kosta.vo.Student;

public class ManageService {
	// 1st Method
	public void inputRandomAttendance(Student[] students){
		int randomIndex = 0;
		int temp[] = new int[30];
		for (int i = 0; i < students.length; i++){
			temp = new int[30];
			for(int j = 0; j < 30; j++){
				randomIndex = (int)((Math.random()*10 + 1))%3;
				temp[j] = randomIndex;
			}
			students[i].setAttendances(temp);
		}
		
		// (1 ~ 10) --> %3 0,1,2
		// Math.Random() * 10 +1 --> 1 ~ 10 
		// 
	}
	// 2nd Method
	public String countAttendance(Student student){
		int attendCount = 0;
		int lateCount = 0;
		int absentCount = 0;
		int[] temp = student.getAttendances();
		
		for(int i = 0; i < 30; i++){
			switch(temp[i]) {
				case Student.ATTEND: {
					attendCount++;
					break;
				}
				case Student.LATE: {
					lateCount++;
					break;
				}
				case Student.ABSENT: {
					absentCount++;
					break;
				}
			}
		}
		
		return "-Attendence : " + attendCount +
				"\n-Late : " + lateCount +
				"\n-Absent : " + absentCount;
	}
	
	// 3rd Method
	public String bestAttendance(Student[] students){
		int count;
		int temp[] = new int[30];
		for(int i = 0; i < students.length; i++){
			count = 0;
			temp = students[i].getAttendances();
			for(int j = 0; j < 30; j++){
				switch(temp[j]){
					case Student.ATTEND: case Student.LATE: {
						count++;
						break;
					}
					default : break;
				}
			}
			students[i].setAttendCount(count);
		}
		
		// compare
		Student tempStudent = students[0];
		for(int i = 1; i <students.length; i++){
			if(tempStudent.getAttendCount() < students[i].getAttendCount() ){
				tempStudent = students[i];
			}
		}
		
		return "Student with Best Attendance : " + tempStudent.getName() + "\n";
	}
	// 4rd Method
	public String WorstAttendance(Student[] students){
		int count;
		int temp[] = new int[30];
		for(int i = 0; i < students.length; i++){
			count = 0;
			temp = students[i].getAttendances();
			for(int j = 0; j < 30; j++){
				switch(temp[j]){
					case Student.ABSENT: {
						count++;
						break;
					}
					default : break;
				}
			}
			students[i].setAttendCount(count);
		}
		
		// compare
		Student tempStudent = students[0];
		for(int i = 1; i <students.length; i++){
			if(tempStudent.getAttendCount() < students[i].getAttendCount() ){
				tempStudent = students[i];
			}
		}
		
		return "Student with Worst Attendance : " + tempStudent.getName() + "\n";
	
	}
}
	