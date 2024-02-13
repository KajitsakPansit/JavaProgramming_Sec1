import java.util.*;
import java.io.*;
public class SentenceText {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		PrintStream writeFile = new PrintStream((new File("d://txtFile//sentence.txt")));
		int i = 1;
		while(true) {
			System.out.print("Sentence : ");
			String word = scan.next();
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			writeFile.println(i+": "+word.toUpperCase());
			i++;
		}
		System.out.println("File is save!!");
		writeFile.close();
	}

}
