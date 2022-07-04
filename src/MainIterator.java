import java.util.Iterator;
import java.util.ArrayList;

public class MainIterator {
	
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();

		cars.add("Hello");
		cars.add("Welcome");
		
		Iterator<String> it = cars.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
