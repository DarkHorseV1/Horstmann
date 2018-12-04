package inc.brocorp;

import java.util.*;

public class Invoice
{
	private String contragent;
	private double total;
	private List<Line> lines = new ArrayList<Line>();
	
 	public Invoice(String contragent)
	{
		super();
		this.contragent = contragent;
	}

	public void setContragent(String contragent)
	{
		this.contragent = contragent;
	}

	public String getContragent()
	{
		return contragent;
	}

	public double getTotal()
	{
		return total;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%-20s Total:%15.2f\n", getContragent(),getTotal()));
		sb.append("------------------------------------------\n");
		for(Line line : lines)
			sb.append(line.toString()).append('\n');
		return sb.toString();
	}
	public class Line
	{
		private String product;
		private int quantity;
		private double price;
		private double summa;
		
		private void updateSumma(boolean update)
		{
			if(update)
				total-=summa;
			this.summa=quantity*price;
			total+=summa;
		}
		
		public Line(String product, int quantity, double price)
		{
			super();
			this.product = product;
			this.quantity = quantity;
			this.price = price;
			updateSumma(false);
			lines.add(this);
			
		}

		public String getProduct()
		{
			return product;
		}

		public void setProduct(String product)
		{
			this.product = product;
		}

		public int getQuantity()
		{
			return quantity;
		}

		public void setQuantity(int quantity)
		{
			this.quantity = quantity;
			updateSumma(true);
		}

		public double getPrice()
		{
			return price;
		}

		public void setPrice(double price)
		{
			this.price = price;
			updateSumma(true);
		}

		public double getSumma()
		{
			return summa;
		}
		public String toString()
		{
			return String.format("%-20s : %4d %6.2f %7.2f",
					getProduct(), getQuantity(), getPrice(),getSumma());
		}
	}
}
