import java.io.*;
import java.util.*;
public class Lab1201 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		while(scan.hasNext()) {
			//read name from file
			String fName = scan.next();
			String lName = scan.next().substring(0,1);
			scan.next();
			String email =scan.next().toUpperCase();
			System.out.println(lName+"."+fName+" "+"("+email+")");
		}
	}

}
