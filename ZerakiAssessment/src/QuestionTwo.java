
public class QuestionTwo {
	
	static String reverseCharacters(String s, int k, int len) {
		
		for (int i = 0; i < s.length();) 
	    { 
			  
	        if (i + k > len) 
	            break; 
	  
	        // Reverse first k characters 
	        s = s.substring(0, i) + new String(new StringBuilder( 
	            s.substring(i, i + k)).reverse()) +  
	            s.substring(i + k); 
	        
	  	        i += 1 * k; 
	    } 
	    return s; 
	} 

	public static void main(String[] args) {
		
		String s = "Lorem at"; 
	    int len = s.length(); 
	    int k = 4; 
	    System.out.println(reverseCharacters(s, k, len)); 
	}

}
