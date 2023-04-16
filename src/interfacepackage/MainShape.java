package interfacepackage;

public class MainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonRoundedShape shape=new Rectangle(7, 9);
		shape.area();
		shape.perimeter();
		shape.show();
		System.out.println("===============");
		shape=new Square(7);
		shape.area();
		shape.perimeter();
		shape.show();
		System.out.println("===============");
		Circle circle= new Circle(2);
		circle.area();
		circle.circumference();
		System.out.println("Area of Circle : "+circle.getarea());
		System.out.println("Circumference of Circle "+circle.getcircumference());
		
	}

}
