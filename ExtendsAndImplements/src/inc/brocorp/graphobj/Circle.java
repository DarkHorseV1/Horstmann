package inc.brocorp.graphobj;

public class Circle extends GraphicObject
	implements Moveable, Scaleable
{
	protected  int radius;
	protected Point center;
	
	public Circle(int radius, String color)
	{
		super();
		this.radius=radius;
		this.color=color;
	}
	public Circle(int x,int y,int radius, String color)
	{
		super(x,y,color);
		this.radius=radius;
	}
	
	public void scale(int x)
	{
		radius*=x;
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
		return center.x;
	}

	@Override
	public int getY()
	{
		return center.y;
	}

	@Override
	public String toString()
	{
		return String.format("Circle's R:%d Center (%dx, %dy) \"%s\"",radius, this.x, this.y, this.color );

	}
}
