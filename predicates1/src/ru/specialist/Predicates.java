package ru.specialist;


import java.util.ArrayList;
import java.util.List;

public class Predicates
{
    public static void main (String [] a)
    {
        List<Persons> persons = new ArrayList<>();
        persons.add(new Persons("Misha", 15));
        persons.add(new Persons("Masha", 44));
        persons.add(new Persons("Mania", 21));
        persons.add(new Persons("Lena", 19));
        persons.add(new Persons("Sasha", 35));
        persons.add(new Persons("Igori", 55));
        persons.add(new Persons("Oleg", 20));

        for(Persons p: persons)
            System.out.println(p);

    }
}
