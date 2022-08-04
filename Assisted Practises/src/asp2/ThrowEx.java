package asp2;


public class ThrowEx
{
    public static void main(String[] args)
    {

        int a=35,b=0,rs;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Cannot divide by zero!."));
            else
            {
                rs = a / b;
                System.out.print("\n\tThe result is : " + rs);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }

        System.out.print("\n\tProgram Ended!");
    }
}