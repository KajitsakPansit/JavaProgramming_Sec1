import java.util.*;
public class Example_501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word,sentence="";
		while(true) {
			System.out.print("Enter Word : ");
			word = scan.next();
			if(word.equalsIgnoreCase("Stop")) {
				break;
			}
			sentence = sentence + word+" ";
		}
		System.out.print(sentence.toUpperCase());
	}

}
