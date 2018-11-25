package inc.brocorp;

import java.util.ArrayList;
import java.util.List;

public class Persons
{
	String name;
	int age;
	static int count=0;
	
	Persons()
	{
		
	}
	Persons(String name,int age)
	{
		this.name=name;
		this.age=age;
		personsArray.add(this);
		count++;
	}
	
	static List<Persons> personsArray= new ArrayList<Persons>();
	
	static void showAll()
	{
		for(Persons p : personsArray)
		{
			p.show();
		}
		System.out.printf("Total persons: %d", count);
	}
	void show()
	{
		System.out.printf("%s - %d\n", name, age);
	}
}
