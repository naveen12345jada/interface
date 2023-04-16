package dynamicMethoddispatche;

public class FoodCourtMain {

	public static void main(String[] args) {
		FoodCourt fc=new FoodCourt();
		
		fc.setPopcorn(new CaramelPopCorn());
		fc.buy();

	}

}
