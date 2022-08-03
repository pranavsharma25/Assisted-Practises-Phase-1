package accessModifiers;

import java.util.*;
public class WorkingWithMaps {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Pranav");    
	      hm.put(2,"Karan");    
	      hm.put(3,"Kunal");   
	       
	      System.out.println("Elements in the Hashmap are ");  
	      System.out.println("");
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());   
	       System.out.println("");
	      }
	      
	
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Rajat");  
	      ht.put(5,"Kabir");  
	      ht.put(6,"Karthik");  
	      ht.put(7,"Rahul");  

	      System.out.println("Elements in the HashTable are "); 
	      System.out.println("");
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());   
	       System.out.println("");
	      }
	      
	   
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Deepika");    
	      map.put(9,"Mayank");    
	      map.put(10,"Nikhil");       
	      
	      System.out.println("Elements in the TreeMap are ");  
	      System.out.println("");
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	       System.out.println("");
	      }    
	      
	   }  
}

