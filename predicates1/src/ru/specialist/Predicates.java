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
        persons.add(new Persons("Mania", 11));
        persons.add(new Persons("Lena", 17));
        persons.add(new Persons("Sasha", 35));
        persons.add(new Persons("Igori", 55));
        persons.add(new Persons("Oleg", 20));

        int summa = 0;
        int adultPersons = 0;
        for(Persons p: persons)
        {
            if (p.getAge() >= 18) {
                summa += p.getAge();
                adultPersons++;
            }
        }
        double averageAge = (double)summa/adultPersons;
        System.out.println(averageAge);
        

        //persons.stream().forEach(p -> System.out.println(p));
        persons.stream()
                .filter(p -> p.getAge()>=18)
                .sorted( (p1, p2) ->p1.getName().compareTo(p2.getName()))
                .map(p -> p.getName()) //Преобразовавыет Объект в строки
                .forEach(System.out::println);
    }
}
