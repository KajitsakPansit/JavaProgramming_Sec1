import java.util.*;
public class Lab603 {
	static Scanner scan = new Scanner(System.in);
	static String fullname,firstName,midName,lastName;
	public static void main(String[] args) {
		System.out.print("Please enter your name,separated by a space.\n:");
		fullname = scan.next();
		abbreviatName(fullname);
	}
public static String abbreviatName(String fullname) {
	String fName= fullname.substring(0,fullname.indexOf(' '));
	String midName=fullname.substring(0,fullname.indexOf(' ')+1),fullname.substring(0,fullname.indexOf(' ')+2);
	String lName=  fullname.substring(0,fullname.lastIndexOf(' ')+1),fullname.substring(0,fullname.lastIndexOf(' ')+2);
	return midName +"."+lName+"."+fName;
}
}
