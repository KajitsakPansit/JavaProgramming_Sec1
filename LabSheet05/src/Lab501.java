import java.util.*;
public class Lab501 {
	public static void main(String[] args) {
		String fullname;
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name:");
		fullname = scan.nextLine();
		int space = fullname.trim().indexOf(" ");
		if(space ==-1) {
			System.out.print("Incorrect Name");
		}
	else {
		String name,lastName;
		name = fullname.substring(0,space);
		lastName = fullname.substring(space,fullname.length());
		System.out.println("First Name :"+name.toUpperCase());
		System.out.print("Last Name: "+lastName.toLowerCase());
		}

	}

}
