package inc.brocorp;


public class Outer
{
	private int data;

	public Outer(int data)
	{
		super();
		this.data = data;
	}
	public static MOperator l;
	public static MOperator l2;
	public int getData()
	{
		class Local implements MOperator			//��������� �����
		{
			public void multiple()
			{
				data++;
			}
		}
		l = new Local();
		l2 = new MOperator()						// ��������� �����
		{
			public void multiple()
			{
				data*=2;
			}
		};
		
		return data;
	}

	public void setData(int data)
	{
		this.data = data;
	}
}
