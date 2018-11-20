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


        // анонимный класс исп. в версии 1.7 и более ранних
        sw.addListener(new Electricity()
        {
            @Override
            public void electricityOn()
            {
                System.out.println("Пожар!");
            }
        });

        sw.switchOn();
    }
}
