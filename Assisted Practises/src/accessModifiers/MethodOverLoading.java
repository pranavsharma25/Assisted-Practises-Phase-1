package accessModifiers;

public class MethodOverLoading {
	
	public void area(int l,int b,int h)
    {
         System.out.println("Area of Triangle : "+(l*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

	public static void main(String[] args) {
		
		MethodOverLoading obj=new MethodOverLoading();
		
	       obj.area(10,10,12);
	       
	       obj.area(5);  
	   
}

}
