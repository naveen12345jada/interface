package interfacepackage;

public class Rectangle implements NonRoundedShape{
	private int length,breadth,area,perimeter;
	public  Rectangle(int length,int breadth) {
		super();
		this.length=length;
		this.breadth=breadth;
		
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle : " + area);
		System.out.println("Perimeter of Rectangle : " + perimeter);
			
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		area = length * breadth;
	}
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		perimeter=2*(length+breadth);
		
		
	}
		
		
}	
		
			
		
		
		
		
	
	
