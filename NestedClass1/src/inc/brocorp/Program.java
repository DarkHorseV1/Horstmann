package inc.brocorp;



public class Program
{
	public static final int STEPS = 1000000;
	public static double integral(MathFunction f,double a, double b)
	{
		double h = (b-a)/STEPS;
		double summa=0D;
		
		for(int i =0; i<STEPS; i++)
		{
			double x= a+h*i+h/2;
			double y = f.function(x);
			summa += y*h;
		}
		return summa;
	}
	public static void main(String[] args)
	{
		{
			double r1 = integral(								//Usecase анонимного класса
					new MathFunction()							// equals "class Local implements MathFunction
					/*											// 		  "Local l = new Local();
					команда new MathFunction() подразумевает
					создание объекта анонимного класса
					реализуещего интерфейс MathFunction
					*/
					{
						public double function(double x)
						{
							return Math.sin(x);
						}
					}
					,0, Math.PI/2);
			System.out.println(r1);
		}
		{
			Invoice inv1 = new Invoice("BlackStar Shaverma");
			inv1.new Line("Titmati's song",4 ,100);
			Invoice.Line c1=inv1.new Line("Black Burger ",2 ,321.99);
			Invoice.Line c2=inv1.new Line("Egor Creed",1 ,99);
			c1.setQuantity(4);
			System.out.println(inv1);
			Outer O = new Outer(10);
			System.out.println(O.getData());
			Outer.l.multiple();
			System.out.println(O.getData());
			Outer.l2.multiple();
			System.out.println(O.getData());
		}
	}	
}
