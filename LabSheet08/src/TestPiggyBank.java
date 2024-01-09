import java.util.*;
public class TestPiggyBank {
	static Scanner scan = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();
	public static void main(String[] args) {
		inputCoin();
		/*pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal()); 
		pb.addFive(100);*/

	}
public static void inputCoin() {
	System.out.println("Money Total : "+pb.getTotal());
	System.out.print("Please define size of PiggyBank : ");
	int sizeofPiggyBank = scan.nextInt();
	pb.setPiggyBank(sizeofPiggyBank);
	System.out.println("Size of your PiggtBank : "+pb.getPiggyBank());

	MainMenu();
}
public static void MainMenu() {
	while(true) {
		
		System.out.println("=============================");
		System.out.println("Menu of Piggy Bank");
		System.out.println("=============================");
		System.out.println("[1]one baht.");
		System.out.println("[2]two baht.");
		System.out.println("[3]three baht.");
		System.out.println("[4]four baht.");
	    System.out.println("[5]Exit");
	    System.out.print("Please Select Menu[1-5] : ");
	    int insertBaht = scan.nextInt();
		int total = 0;
		if (insertBaht == 1) {
			System.out.print("Insert 1 Baht Money : ");
			total = scan.nextInt();
			pb.addOne(total);
			System.out.println("Money total : "+pb.getTotal());
			
		}
		else if(insertBaht == 2) {
			System.out.print("Insert 2 Baht Money : ");
			total = scan.nextInt();
			pb.addTwo(total);
			System.out.println("Money total : "+pb.getTotal());
		}
		else if(insertBaht == 3) {
			System.out.print("Insert 2 Baht Money : ");
			total = scan.nextInt();
			pb.addFive(total);
			System.out.println("Money total : "+pb.getTotal());
		}
		else if(insertBaht == 4) {
			System.out.print("Insert 2 Baht Money : ");
			total = scan.nextInt();
			pb.addTen(total);
			System.out.println("Money total : "+pb.getTotal());
		}
		else {
			System.out.println("Bye Bye");
			break;
		}
	}
}
}
