import java.io.*;
import java.util.*;
public class Example1202 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Section : ");
		int section = scan.nextInt();
		Header(section);
		showListStudent(section);
	}
	public static void showListStudent(int section) throws IOException{
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String temp ="";
		while((temp = readFile.readLine())!=null) {
			String [] data = temp.split("\t");
			double midtermScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			int sec =Integer.parseInt(data[3]);
			if(sec == section) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+midtermScore+"\t"+finalScore+"\t"+findResult(midtermScore,finalScore));
				
			}
		}
		readFile.close();
	}
	public static String findResult(double mid,double finalscore) {
		double totalScore = mid+finalscore;
		if(totalScore<=40) {
			return "Fail";
		}
		else
		return "Pass";
	}
	public static void Header(int section) {
		System.out.println("**************************************************");
		System.out.println("\tList of Data for Section "+section);
		System.out.println("**************************************************");
	}

}
