package ru.specialist;

import java.util.ArrayList;
import java.util.List;

public class Switcher
{
    private List<Electricity> listeners = new ArrayList<>();

    public void addListener(Electricity listener)
    {
        if(!listeners.contains(listener))
            listeners.add(listener);
    }

    public void removeListener(Electricity listener)
    {
        if(listeners.contains(listener))
            listeners.remove(listener);
    }

    public void switchOn()
    {
        System.out.println("Выключатель включен!");
        for(Electricity e: listeners)
            e.electricityOn();
    }

}
