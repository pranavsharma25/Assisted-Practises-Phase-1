package accessModifiers;

public class WorkingWithString {
	
	public static void main(String[] args) {
		
		System.out.println("Conversion");
		System.out.println("");
		
		String str = "Pranav"; 
		
        
     
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr);
        System.out.println("");
          
   
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("Sharma"); 
        System.out.println("");
        System.out.println("String to StringBuilder");
        System.out.println(sbl);
        
        System.out.println("");
	}

}
