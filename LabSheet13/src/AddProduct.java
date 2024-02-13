import java.io.*;
import java.util.*;
public class AddProduct {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		//PrintWriter writeFile = new PrintWriter(new File("d;//txtFile//Product.txt"));
		FileWriter filename = new FileWriter("d://txtFile//Product.txt",true);
		PrintWriter writeFile = new PrintWriter(filename);
		System.out.print("Product Id : ");
		String id = scan.next();
		System.out.print("Product Name : ");
		String name = scan.next();
		System.out.print("Product Unit : ");
		int unit = scan.nextInt();
		System.out.print("Product Unit : ");
		float price = scan.nextFloat();
		
		writeFile.println(id+","+name+","+unit+","+price);
		System.out.println("Write file already...");
		
		writeFile.close();
	}

}
