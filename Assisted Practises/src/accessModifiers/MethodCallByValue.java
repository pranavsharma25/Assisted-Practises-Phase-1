package accessModifiers;

public class MethodCallByValue {
	
	int value=150;

	int operation(int value) {
		
		value =value*10/100;
		
		return(value);
	}

	public static void main(String[] args) {
		
		MethodCallByValue obj = new MethodCallByValue();
		
		System.out.println("Before operation value of data is "+obj.value);
		
		obj.operation(100);
		
		System.out.println("After operation value of data is "+obj.value);
		}
	}
		

