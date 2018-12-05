package inc.brocorp;

import inc.brocorp.graphobj.*;

public class ExtendsAndImplements1
{

	public static void main(String[] args)
	{
		GraphicObject p1= new Point();
		Point p2= new Point(11,22);
		GraphicObject p3= new Point(150,-1,"Red");
		Circle c1= new Circle(20,"Green");
		Circle c2= new Circle(5,-5,100,"Orange");
		//c2.draw();
		c1.scale(10);
		p2.move(-6, -12);		
		GraphicObject.drawScence();
		GraphicObject.moveScenece(10, 10);
		GraphicObject.drawScence();
		GraphicObject.scaleScenece(2);
		GraphicObject.drawScence();
	}

}
