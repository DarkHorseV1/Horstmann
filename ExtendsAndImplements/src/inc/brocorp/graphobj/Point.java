package inc.brocorp.graphobj;

public class Point extends GraphicObject
	implements Moveable
{
	
	public Point()
	{
		super();
	}
	
	public Point(int x, int y)
	{
		super(x,y);
	}
	
	public Point(int x, int y, String color)
	{
		super(x,y,color);
	}
	
	public void move(int x, int y)
	{
		this.x+=x;
		this.y+=y;
	}

	@Override
	public void draw()
	{
		System.out.println(this);
		
	}

	@Override
	public int getX()
	{
		return this.x;
	}

	@Override
	public int getY()
	{
		return this.y;
	}
	
	@Override
	public String toString()
	{
		return String.format("Point: (%dx, %dy) \"%s\"",this.x, this.y, this.color );
	}
	
}
