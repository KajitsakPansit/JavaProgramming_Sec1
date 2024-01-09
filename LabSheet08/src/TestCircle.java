
public class TestCircle {

	public static void main(String[] args) {
		//declare two object reference from Class Circle
		Circle_1 c1 = new Circle_1();//สร้าง object เรยกใช้ Circle
		Circle_1 c2 = new Circle_1();
		Circle_1 c3 = new Circle_1();
		
		//assign radius to the first object and display
		c1.setRadius(2.0);
		c2.setColor("blue");
		System.out.print("Circle area of object c1 is "+c1.getArea());
		System.out.println(",and color is "+c2.getColor());
		
		c1.setRadius(2.0);
		c2.setColor("red");
		System.out.print("Circle area of object c2 is "+c1.getArea());
		System.out.println(",and color is "+c2.getColor());
		c1.setRadius(1.0);
		c2.setColor("red");
		System.out.print("Cirlce area of object c3 is "+c1.getArea());
		System.out.println(",and color is "+c2.getColor());
		
	}
	public static String showColor(String color) {
		return "The color is "+color;
	}

}
