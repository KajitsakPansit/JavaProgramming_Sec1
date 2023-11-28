import java.util.*;
public class SalepersonSalary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;
		int sale;
		double salary;
		while (true) {
			System.out.print("Input salary : ");
			salary = scan.nextDouble();
			System.out.println("Enter sales in dollars (or -1 to end) : ");
			System.out.printf("Salary is : %.2f\n",salary);
			if (salary == SENTINEL)
				break;		
			else
			{
				System.out.print("Input salary : ");
				salary = scan.nextDouble();
				System.out.println("Enter sales in dollars (or -1 to end) : ");
				System.out.printf("Salary is : %.2f\n",salary);

			}
			
			
		}
		
	}		
}

