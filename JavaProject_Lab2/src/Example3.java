import java.text.*;
import java.util.*;
public class Example3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.print("Input product name   : ");
		String productName = input.nextLine();
		System.out.print("Input product unit   : ");
		int productunit = input.nextInt();
		System.out.print("Input price per unit : ");
		float productperunit= input.nextFloat();
		System.out.println();
		float totalPrice= productunit*productperunit;
		System.out.println("Total price is "+frm.format(totalPrice)+ " baht.");
		float Vat = totalPrice+(totalPrice*7/100);
		System.out.println("Add Vat 7%  is "+frm.format(Vat)+" baht.");
		
	}

}
