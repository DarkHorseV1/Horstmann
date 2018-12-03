package inc.brocorp;

public class BoundExceptions extends Exception
{
	private int data;
	
	public BoundExceptions(String s )
	{
		super(s);
	}
	
	public BoundExceptions(String s ,int data)
	{
		super(s);
		this.data=data;
	}

	public int getData()
	{
		return data;
	}
	
	
}
