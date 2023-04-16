package abstractclassexample;

public abstract class Car {
	public String color ,model;
	public Car(String color,String model) {
		
		super();
		this.color=color;
		this.model=model;
	}
	public String getcolor(){
		return color;	
	}
	public String getmodel() {
		return model;
	}
	abstract public  void Engine();
	

}
