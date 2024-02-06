
import java.util.*;

public class FictionDemo1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String title = scan.nextLine();

		int PublicYear = scan.nextInt();

		FictionBook book = new FictionBook(title,PublicYear);

		String name=scan.next();

		String name1 = scan.next();

		String email=scan.next();

		String a =name+" "+name1;

		book.setAuthor(a);

		book.setEmail(email);

		while(true) {

			if(book.checkEmail()==false) {

				email=scan.next();

				

			}

			else if(book.checkEmail()==true) {

				System.out.print(book);

				break;

			}

		}	

	}

}