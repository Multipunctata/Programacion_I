import java.util.HashMap;

public class Hashmap {
	
	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		// Enter keys and values(Country, City)
		capitalCities.put("Paraguay", "Asunci�n");
		capitalCities.put("Inglaterra", "London");
		capitalCities.put("Alemania", "Berl�n");
		capitalCities.put("Estados Unidos", "Washington DC");
		capitalCities.put("Noruega", "Oslo");
		
		for (String i : capitalCities.keySet()) {
			System.out.println("key: " + i + " value: " + capitalCities.get(i));
		}
		
	}
	
}
