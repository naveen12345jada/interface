package interfacepackage;

public  class Circle extends ValueInput implements Shape, RoundedShape{
	private double Area,Circumference;
	public Circle(int radius) {
		setvalue(radius);
		
	}	
		@Override
		public void circumference() {
			Circumference=2*PI*Getvalue();
		}
		@Override
		public void area() {
			Area=PI*Getvalue()*Getvalue();
		}
		public double getarea() {
			return Area;
		}

		
		public double getcircumference() {
			return Circumference;
		}

		
		
	}
	


