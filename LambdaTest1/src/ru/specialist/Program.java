package ru.specialist;

public class Program
{
    public static void main(String[] args)
    {
        Switcher sw = new Switcher();
        Lamp lamp1 = new Lamp();
        Radio radio1 = new Radio();

        sw.addListener(lamp1);
        sw.addListener(radio1);


        sw.addListener( () -> System.out.println("Fire!!") );

        sw.switchOn();
    }
}
