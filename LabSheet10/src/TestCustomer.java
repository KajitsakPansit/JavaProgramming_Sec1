public class TestCustomer {
	public static void main(String[] args) {
		 System.out.println("###Test Customer class###");
		 Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		 System.out.println(c1);
		 c1.setDiscount(5);
		 System.out.println(c1);

		 
		 Line();
		 System.out.println("id is : "+c1.getID());
		 System.out.println("name is : "+c1.getName());
		 System.out.println("discount is : "+c1.getDiscount());
		 
		 Line();
		 System.out.println("###Test Invoice class###");
		 Invoice inv1 = new Invoice(101, c1, 12000.00);
		 System.out.println(inv1);
		 inv1.setAmount(10000);
		 System.out.println(inv1);
		 
		 
		 Line();
		 System.out.println("customer's id is : "+inv1.getID());
		 System.out.println("customer's name is : "+inv1.getCustomerName());
		// System.out.println("amount is : "+inv1.getAmountAfterDiscount());
		 // show invoice's id
		 // Customer's toString() by instance inv1
		 // show invoice's amount
		 Line();
		 // show customer's id by instance inv1
		 // show customer's name by instance inv1
		 // show customer's discount by instance inv1
		 // show invoice's amount after discount(format as output)
		 } //end of main method()
		 public static void Line() {
		 System.out.println("*********************************"); 
		 }
		} //end of class()


