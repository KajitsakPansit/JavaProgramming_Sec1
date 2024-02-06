import java.util.*;
import java.io.*;
public class Example1201 {
	public static void main(String[] args) throws IOException{
		//Using Scanner class for read data from file 
		Scanner scan = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		
		while(scan.hasNext()) {
			//read name from file
			String fName = scan.next();
			scan.next();
			scan.next();
			String email =scan.next().toUpperCase();
			System.out.println(fName+" "+"("+email+")");
		}
		scan.close();
	}

}
