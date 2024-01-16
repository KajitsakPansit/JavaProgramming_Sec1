import java.util.*;
public class BookDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input book title : ");
		String bookTitle = scan.nextLine();
		System.out.print("Input book price : ");
		float bookPrice = scan.nextFloat();
		System.out.print("Input publish year : ");
		int publish = scan.nextInt();
		Book b1 = new Book();
		b1.setTitle(bookTitle);
		b1.setPrice(bookPrice);
		b1.setPublishyear(publish);
		System.out.print(b1);
		
		
		
		
	}

}
