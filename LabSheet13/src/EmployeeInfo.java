import java.util.*;
import java.io.*;
public class EmployeeInfo {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		String choice,department;
		System.out.print("Insert or Read Data? : ");
		choice = scan.next().toLowerCase();
		
		while(!(choice.equals("insert")) && !(choice.equals("read"))) {
			System.out.print("Please text insert or read data? : ");
			choice = scan.next().toLowerCase();
		}
		SaveandOpen obj = new SaveandOpen();
		if(choice.equals("insert")) {
			obj.insert();
		}
		else if(choice.equals("read")) {
			System.out.print("\nEnter dept : ");
			department = scan.next();
			obj.setDept(department);
			obj.read();
		}
	}

}
