package enumExample;

public class EnumExample1 {
	public enum week{monday,tuesday,wednesday,thur,fri,sat,sun}
	public static void main(String [] args) {
		for(week w : week.values()) {
			System.out.println(w); //traversing the enum  
		}
		System.out.println("Value of monday is: "+week.valueOf("monday"));  
		System.out.println("Index of monday is: "+week.valueOf("monday").ordinal());  
		System.out.println("Index of fri is: "+week.valueOf("fri").ordinal());  
	}

}
