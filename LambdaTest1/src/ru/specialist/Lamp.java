package ru.specialist;

public class Lamp implements Electricity
{
    public void lampOn()
    {
        System.out.println("Лампа зажглась!");
    }


    @Override
    public void electricityOn()
    {
        System.out.println("Электричество подано.");
        lampOn();
    }
}
