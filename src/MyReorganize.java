import java.util.ArrayList;

public class MyReorganize {
	
	public static void main(String[] args) {
		ArrayList<String> arreglo = new ArrayList<String>();
		int x = 5, y = 0, z = 4;
		arreglo.add("uno");
		arreglo.add("dos");
		arreglo.add("tres");
		arreglo.add("cuatro");
		arreglo.add("cinco");
		while (y < 5) {
			
			if (y == 0 || y == 4) {
				x = 5;
			} else {
				x = 6;
			}
			
			if (y == 0 || y == 1) {
				arreglo.add(arreglo.get(y));
				arreglo.set(y, arreglo.get(z));
				z--;
			} else if (y == 2){
				arreglo.set(y, arreglo.get(z));
				z = 6;
			} else if (y == 3) {
				arreglo.set(y, arreglo.get(z));
			} else {
				arreglo.set(y, arreglo.get(x));
			}
			
			y++;
		}
		arreglo.remove(6);
		arreglo.remove(5);
		for (String elemento : arreglo) {
			System.out.println(elemento);
		}
	}
	
}
