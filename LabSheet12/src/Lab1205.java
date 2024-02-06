import java.util.*;
import java.io.*;
public class Lab1205 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(new File("d://txtFile//student.txt"));
		Head();
		int i =0;
		while(scan.hasNext()) {
			String id = scan.next();
			scan.next();
			String fName = scan.next().substring(0,1);
			String lName = scan.next();
			double grade = scan.nextDouble();
			scan.next();
			System.out.println(i+"."+"\t"+id+"\t"+Level(id)+"\t"+fName+"."+lName+"\t"+grade+"\t"+Status(grade));
			i+=1;
		}
	}
	public static String Level(String id) {
		if(id.startsWith("18")) {
			return "4th";
		}
		else if(id.startsWith("19")) {
			return "3th";
		}
		else
			return "2th";
	}
	public static String Status(double grade) {
		if(grade >= 2.00) {
			return "Pass";
		}
		else if(grade>=1.00||grade<2.00) {
			return "Critical";
		}
		return "Retied";
	}
	public static void Head() {
		System.out.println("No."+"\tID"+"\t\t"+"Level"+"\t"+"Name"+"\t\t"+"Grade"+"\tStatus"
	+"\n******************************************************************");
	}
}
