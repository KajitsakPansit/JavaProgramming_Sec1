import java.util.*;

public class MovieDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Input movie id : ");

		String input = scan.nextLine();

		

		System.out.print("Input movie name :");

		String input1=scan.nextLine();

		

		System.out.println();

		

		System.out.print("Input director name : ");

		String name = scan.nextLine();

		

		System.out.print("Input direct e-mail : ");

		String email = scan.nextLine();

		

		System.out.print("Input direct gender :");

		char gender = scan.nextLine().charAt(0);

		

		while(true) { 		

				if(gender=='f'||gender=='F'||gender=='m'||gender=='M') {

					break;

				}

				else if(gender!='f'||gender!='F'||gender!='m'||gender!='M') {

					System.out.print("Input direct gender , again :");

					gender =scan.nextLine().charAt(0);

				}

		}

		System.out.println();

		Director director = new Director(name ,email,gender);

		Movie movie = new Movie(input,input1,director);

		System.out.print("Input movie theater no. : ");

		int no = scan.nextInt();

		while(!(no>=1&&no<=15)) {

			System.out.print("Please input 1 - 15 only : ");

			no = scan.nextInt();

		}

		System.out.println();

		Theater theater = new Theater(input,input1,director,no);

		System.out.print(theater);

		

	}

}