import java.util.*;
public class Lab503 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.next();
		String mes = message.toLowerCase();
		String text="";
		int count=0;
		System.out.print("");
		if(message.indexOf("nichi")>=0) {
			count ++;
			System.out.print("Nichi is a sentence");
		}
		else
			System.out.print("Infomation Technology");
		
		
	}

}
