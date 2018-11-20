package ru.specialist;

public class Radio implements Electricity
{
    public void radioOn()
    {
        System.out.println("Let's ROCK!!!");
    }


    @Override
    public void electricityOn()
    {

        System.out.println("Электричество подано.");
        radioOn();
    }
}
