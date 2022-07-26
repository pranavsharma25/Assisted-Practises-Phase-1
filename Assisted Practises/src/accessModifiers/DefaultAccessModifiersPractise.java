package accessModifiers;

class defaultAccessModifiers
{ 
  void display() 
     { 
         System.out.println("We are using defalut access modifiers!"); 
     } 
} 

public class DefaultAccessModifiersPractise {

	public static void main(String[] args) {
	
		System.out.println("Default Access Modifiers");
		
		defaultAccessModifiers obj = new defaultAccessModifiers(); 		  
        
		obj.display(); 

	}
}
