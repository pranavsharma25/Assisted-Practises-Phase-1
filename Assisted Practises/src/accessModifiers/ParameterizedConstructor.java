package accessModifiers;

class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		
		Std std1=new Std(101,"Pranav");
		
		Std std2=new Std(102,"Karan");
		
		std1.display();
		
		std2.display();
			
	

	}

}
