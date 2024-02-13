import java.io.*;
import java.util.*;
public class Lab1202 {
	public static void main(String[] args) throws IOException{
		Scanner scan1= new Scanner(System.in);
		Scanner scan = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		System.out.print("Input : ");
		String email=scan1.next();
		boolean check = false;
		while(scan.hasNext()) {
			scan.next();
			scan.next();
			String password = scan.next();
			String email1 =scan.next().toUpperCase();
			if(email.equalsIgnoreCase(email1)) {
				System.out.print("Your password is "+password);
				check = true;
				if(check) {
					break;
				}
			}
			else 
				check=false;
		}
		if(check==false) {
			System.out.print("The data not found...");
		}

		scan.close();
	}

}
