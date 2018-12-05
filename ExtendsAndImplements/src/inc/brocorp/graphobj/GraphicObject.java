package inc.brocorp.graphobj;

import java.util.ArrayList;
import java.util.List;

public abstract class GraphicObject
{
	protected int x;
	protected int y;
	protected String color;
	public static final String DEFAULT_COLOR = "Black";
	private static List<GraphicObject> scence = new ArrayList<GraphicObject>();
	
	public GraphicObject()
	{
		this.x=0;
		this.y=0;
		color=DEFAULT_COLOR;
		scence.add(this);
	}
	
	public GraphicObject(int x, int y)
	{
		this();
		this.x=x;
		this.y=y;
		
	}
	
	public GraphicObject(int x, int y, String color)
	{
		this(x,y);
		this.color=color;
		
	}
	
	public abstract void draw();	
	public abstract int getX();
	public abstract int getY();
	
	public static void drawScence()
	{
		System.out.println("***************************");
		for(GraphicObject g : scence)
		{
			g.draw();
		}
		System.out.println("***************************");
	}
	
	public static void scaleScenece(int x)
	{
		for(GraphicObject g : scence)
		{
			if(g instanceof Scaleable)					//instanceof (только)проверяет можно ли привести ОП к типу
			{
				Scaleable s=(Scaleable)g;
				s.scale(x);
			}
		}
	}
	
	public static void moveScenece(int x, int y)
	{
		for(GraphicObject g : scence)
		{
			if(g instanceof Moveable)
			{
				Moveable s=(Moveable)g;
				s.move(x,y);
			}
		}
	}
	
	@Override
	public String toString()
	{
		return String.format("Point: (%dx, %dy) \"%s\"",this.x, this.y, this.color );
	}
}
