package enumExample;

public enum Dish {
	CHICKEN(false,550,890.99),FISH(false,450,1500.80),PANEER(true,480,750.69),DAAL(true,660,350.78),BRINJAL(true,280,250.90);
	private boolean vegetarian;
	private int calorie;
	private double price;
private  Dish(boolean vegetarian ,int calorie ,double price ) {
	this.vegetarian=vegetarian;
	this.calorie = calorie;
	this.price = price;
}
public boolean isvegetarian() {
	return vegetarian;
}
public int getCalorie() {
	return calorie;
}
public double getPrice() {
	return price;
}
public static void main(String []args) {
	Dish s =Dish.CHICKEN;
	System.out.println(s.isvegetarian());
	System.out.println(s.getCalorie());
	System.out.println(s.getPrice());
	
	Dish s1= Dish.FISH;
	System.out.println(s1.isvegetarian());
	System.out.println(s1.getCalorie());
	System.out.println(s1.getPrice());
	Dish s2= Dish.PANEER;
	System.out.println(s2.isvegetarian());
	System.out.println(s2.getCalorie());
	System.out.println(s2.getPrice());
	
}

	
	
	
	
	
}
