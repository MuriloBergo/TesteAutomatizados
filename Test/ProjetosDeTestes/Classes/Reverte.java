package Classes;

public class Reverte {

	public static String revert(String s){
		if (s == null) {
			return s;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.reverse();
		
		return  sb.toString();
		
	}
	
	
	public static boolean isEmpty(String s){
		if (s == null) {
			return true;
		}
		s = s.trim();
		return s.length() == 0;
	}
	
	
	
	
	
}
