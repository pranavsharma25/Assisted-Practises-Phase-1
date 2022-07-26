package accessModifiers;

public class MethodPractise {
	
	public int multipynumbers(int a,int b) {
		int x=a*b;
		return x;
	}

	public static void main(String[] args) {
		
		
		MethodPractise b=new MethodPractise();
		
		int ans= b.multipynumbers(10,5);
		
		System.out.println("Multipilcation = "+ans);
	}
		
	}
		
		