import java.text.*;
public class Example2 {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final double BUFFET = 299;
		int numberofcustomer = 5;
		double netprice = BUFFET*numberofcustomer;
		System.out.println("Buffet of "+numberofcustomer +" customers is "+ frm.format(netprice));
		double servicecharge = netprice+(netprice*3/100);
		System.out.println("Add Service Charge 3% is "
				+ frm.format(servicecharge));
		
	}

}
