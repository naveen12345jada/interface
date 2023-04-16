package abstractclassexample;

public class Driver {
private String name;
private Car car;
public Driver(String name) {
	super();
	this.name=name;
}
public void setCar(Car car) {
	this.car=car;
}
public void Engine() {
	System.out.println(name+" is driving  "+car.getcolor()+" color  "+car.getmodel()+"   ");
}

}
