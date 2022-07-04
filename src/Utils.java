public class Utils {
	
	public static float velMRU(float d, float t) {
		float v;
		v = d/t;
		return v;
	}
	
	public static float velMRU(float d, float t, float vi) {
		float v;
		v = vi + d/t;
		return v;
	}
	
	public static float velMRUA(float a, float t) {
		float v;
		v = a*t;
		return v;
	}
	
	public static float velMRUA(float a, float t, float vi) {
		float v;
		v = vi + a*t;
		return v;
	}
	
	public static float velMedia(float v, float vi) {
		float med;
		med = (vi+v)/2;
		return med;
	}
	
	
}
