import java.util.*;
public class AuthorDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Author a1 = new Author();
		String name = scan.next();
		String email = scan.nextLine();
		String gender = scan.nextLine();
		a1.getName();
		a1.getEmail();
		a1.getGenderName();
		System.out.println();
		System.out.println(a1);
	}

}
