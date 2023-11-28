import java.util.*;
public class Eaxmple1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input number : ");
		int currentNember ;
		int previousNumber = scan.nextInt();
		while(true) {
			System.out.print("Input number : ");
			currentNember = scan.nextInt();
			if (currentNember < previousNumber) {
				System.out.println("                                    ");
				System.out.print("Bye Bye");
				break;
			}
			previousNumber = currentNember;
		}

	}

}
