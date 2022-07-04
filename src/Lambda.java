import java.util.ArrayList;

public class Lambda {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(5);
		numeros.forEach( (n) -> {System.out.println(n);} );
	}
	
}
