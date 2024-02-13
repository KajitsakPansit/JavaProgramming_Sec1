import java.io.*;
import java.util.*;
public class SaveandOpen extends Employee {
	private String name;
	private String dept;
	public void insert() throws IOException{
		PrintStream writeFile = new PrintStream((new File("d://txtFile//employee.txt")));
		Scanner scan = new Scanner(System.in);
		String answer;
		do {
			Header();
			System.out.print("Enter name : ");
			name = scan.next();
			System.out.print("Enter department : ");
			dept = scan.next();
			writeFile.println(name+"\t"+dept);
			System.out.print("Enter data again? : ");
			answer = scan.next();
			
		}while(answer.equalsIgnoreCase("y"));
		writeFile.close();
	}
	public void read() {
		try {
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check = false;
			int i = 1;
			Header();
			while(readFile.hasNext()) {
				name= readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.println(i+") "+name);
					i++;
					check = true;
				}
			}
			System.out.print("Employee in dept "+super.getDept()+" is "+--i+" person.");
			if(check == false) {

				System.out.print("Sorry,no department : "+super.getDept()+"in file.");
			}
		}
		catch(IOException e){
			System.out.println("Sorry,fille not found");
		}
	}
}
