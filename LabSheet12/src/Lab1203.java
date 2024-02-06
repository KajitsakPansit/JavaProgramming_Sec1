import java.io.*;
public class Lab1203 {
	public static void main(String[] args) throws IOException{
		// Buffered reader use only import java.io
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//Bookdata.txt"));
		String temp = "";
		int countBook= 0,i=1;
		while((temp = readFile.readLine()) !=null) {
			String [] data = temp.split("\t");
			System.out.println(i+"."+data[0]+" ("+data[1]+"), Rating "+data[2]+"publish on"+data[5]);
			countBook+=1;
			i+=1;
		}
		System.out.println("=====================================================================");
		System.out.println("Total book = "+countBook);
		readFile.close();
	}

}
