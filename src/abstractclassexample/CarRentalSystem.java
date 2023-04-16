package abstractclassexample;

public class CarRentalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bmw b =new Bmw("black", "Bmw1");
		b.Engine();
        Audi a= new Audi("red","audi1");
        a.Engine();
        Toyatoo c= new Toyatoo("orange","Toyatoo1");
        c.Engine();
        
        Driver d =new Driver("naveen");
        d.setCar(b);
        d.Engine();
        Driver e =new Driver("sujan");
        e.setCar(a);
        e.Engine();
	}

}
