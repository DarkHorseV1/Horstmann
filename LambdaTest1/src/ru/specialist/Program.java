package ru.specialist;

public class Program
{
    void fire()
    {
        System.out.println("Fire!!!");
    }
    public static void main(String[] args)
    {
        Switcher sw = new Switcher();
        Lamp lamp1 = new Lamp();
        Radio radio1 = new Radio();

        sw.addListener(lamp1);
        sw.addListener(radio1);

        // лямда (использование НЕ статического метода)
        sw.addListener( new Program()::fire );


        sw.switchOn();
    }
}
