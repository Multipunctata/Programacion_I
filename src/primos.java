
public class primos {

	public static void main(String[] args) {
		int sw  = 0;
		
		for (int x = 2; x <= 100; x++) {
			
			int n = 1;
			
			while(n <= x && sw < 3) {
				
				if(x % n == 0) {
					sw++;
				}
				
				n = n + 1;
			}
			
			if(sw < 3) {
				System.out.printf("%d es primo\n", x);
			}
			
			else {
				System.out.printf("%d no es primo\n" , x);
			}
			sw = 0;
			
		}
		
	}
	
}
