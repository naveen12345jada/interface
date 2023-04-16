package abstractclassexample;

public class Bmw extends Car {
public Bmw(String color, String model) {
	
	super(color,model);
	this.color=color;
	this.model=model;
	
}
public void bmwEngine() {
	System.out.println("bmw engine booms the car");
}
@Override
public void Engine() {
	bmwEngine();
}

}
