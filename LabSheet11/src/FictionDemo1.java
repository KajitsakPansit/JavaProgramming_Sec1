import java.util.*;
public class FictionDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String title = scan.nextLine();
		int PublicYear = scan.nextInt();
		FictionBook book = new FictionBook(title,PublicYear);
		String name=scan.nextLine();
		String email=scan.next();
		book.setAuthor(name);
		book.setEmail(email);
		while(true) {
			if(book.checkFormatName()) {
				break;
			}
			else if(book.checkEmail()) {
				break;
			}
			System.out.print(book);
			break;
		}
	}

}
