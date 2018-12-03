package inc.brocorp;

public class Program
{
	static void test(String s1, String s2)
	{
		try
		{
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
		
			if(n1<0 || n1>100)
				throw new BoundExceptions("Invalid n1", n1);
			if(n2<0 || n2>100)
				throw new BoundExceptions("Invalid n2", n2);
			int n = n1/n2;
			
			System.out.println(n);
		}
		
		catch(BoundExceptions obj)
		{
			System.out.printf("%s %d\n", obj.getMessage(), obj.getData());
		}
		
		catch(NumberFormatException obj)
		{
			System.out.println("Not a number");
		}
		
		catch(ArithmeticException obj)
		{
			System.out.println(obj.getMessage());
		}
		
		finally
		{
			System.out.println("Finally");
	
		}
		System.out.println("Method  \"Test\"");
	}
	public static void main(String[] args)
	{
		test ("11","a");
		System.out.println("Method \"Main\"");

	}

}
