package newThings;

public class ExtractNumberInString {
	public static String extractNumber(final String str) {                
	    
	    if(str == null || str.isEmpty()) return "";
	    
	    StringBuilder sb = new StringBuilder();
	    boolean found = false;
	    for(char c : str.toCharArray()){
	    	//karakter bir rakam ise true; aksi halde false döner:
	        if(Character.isDigit(c)){
	            sb.append(c);
	            found = true;
	        } else if(found){
	            // If we already found a digit before and this char is not a digit, stop looping
	            break;                
	        }
	    }
	    
	    return sb.toString();
	}
	public static void main(String[] args) {
		String str = "zey1616nep";
		//boolean result = str.matches(".*\\d.*");
		System.out.println(extractNumber(str));
		
	}
	
}
