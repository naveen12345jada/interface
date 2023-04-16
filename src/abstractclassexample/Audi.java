package abstractclassexample;

public class Audi extends Car{
	public Audi(String color,String model) {
		super(color,model);
	}
	public void audiEngine() {
		System.out.println("audi engine aooom ");
	}
	@Override
	public void Engine() {
		audiEngine();
	}
	

}
