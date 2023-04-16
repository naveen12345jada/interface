package interfacepackage;

public  class Square implements NonRoundedShape {// during implementation of interface with class  we have to decclare class name as ABSTRACT OTHERWISE IT WILL SHOW ERROR

	private int side,area,perimeter;
	public  Square(int side) {//method name must be same as class name othw error 
		super();
		this.side=side;
		
	}
	@Override
	public void show() {
		System.out.println(area);
		System.out.println(perimeter);
		
	}
	@Override
	public void area() {
		area= side*side;
		
	}
	@Override
	public void perimeter() {
		perimeter=4*side;
		
	}
	
}
