import java.util.*;
public class Lab502 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence;
		System.out.print("Input some sentence : ");
		sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = scan.nextLine();
		}
		System.out.println();
		for (int i =0;i<sentence.length();i++) {
			System.out.println(sentence.substring(i));
		}

		
	}

}
