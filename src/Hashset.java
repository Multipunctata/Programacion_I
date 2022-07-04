import java.util.HashSet;

public class Hashset {
	
	public static void main(String[] args) {
	HashSet<String> cars = new HashSet<String>();
	
	cars.add("BMW");
	cars.add("Toyota");
	cars.add("Toyota");
	
	System.out.println(cars);
	System.out.println(cars.contains("Toyota"));
	System.out.println(cars.size());
	
	for (String i : cars) {
		System.out.println(i);
	}
	}
	
}
