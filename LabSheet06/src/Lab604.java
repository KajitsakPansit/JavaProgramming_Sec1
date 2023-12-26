import java.util.*;
public class Lab604 {
	static Scanner input = new Scanner(System.in);
	static String studentID,subID;
	static int subjectID;
	boolean stdIT,subIT;
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		inputStudent();
		
	}//end 
	public static void inputStudent() {
		do {
			System.out.print("Enter student ID : ");
			studentID = input.next();
			System.out.print("Enter subject ID : ");
			subjectID = input.nextInt();
			subID = subjectID + ""; //เปลี่ยนจาก int เป็น String
		}while(!isLength(studentID,subID));
		System.out.println();
		displayData(isaITStudent(studentID),isITSubject(subID));
	}//end inputStudent
	
	public static boolean isLength(String sid,String subID) {
		if(sid.length()==10&&subID.length()==7) {
			return true;
		}
		else return false;
		
	}//end isLegth
	
	public static boolean isaITStudent(String sid) {
		if(sid.substring(0,3).equals("211")&&sid.substring(3,6).equals("311")) {
			return true;
		}
		else return false;
	}//end IT
	
	public static boolean isITSubject(String stuID) {
		if(stuID.substring(0,2).equals("21")&&stuID.substring(4,5).equals("1")) {
			return true;
		}
		return false;
	}//end ITsub
	
public static void displayData(boolean stdIT,boolean subIT) {
	if(stdIT==true) {
		System.out.println("Student id : "+ studentID +" 1st year student in IT");
	}
	else 
		System.out.println("Student id : "+ studentID +" is not 1st year student in IT");
	if(subIT==true) {
		System.out.println("Enroll in course for Year 1");
	}
	else
		System.out.print("not enroll in course for Year 1");
}//end display
}
