package asp2;

public class TryCatch 
{
    public static void main(String args[]) 
    {
        int[] array = new int[5];
        try 
        {
            array[7] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bound!"); 
        }
        finally 
        {
            System.out.println("The size of array is " + array.length);
        }
    }
}
