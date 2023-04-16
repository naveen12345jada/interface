package abstractclassexample;

public class Toyatoo extends Car{
	public Toyatoo(String color,String model) {
		super(color,model);
	}
@Override
public void Engine() {
	System.out.println("Toyatoo car goes tooom");
}

}
