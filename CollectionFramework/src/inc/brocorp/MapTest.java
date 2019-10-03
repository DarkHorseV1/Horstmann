package inc.brocorp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();       //Создаем ХешМап, она НЕ гарантирует порядок объектов
        hm.put("Billie Eillish", 7500.00);
        hm.put("Tom Holland", 117500.00);
        hm.put("Nil Armstrong", 75.30);
        hm.put("50Cent", 0.50);
        hm.put("Joi Jordison", 120.01);

        Set<Map.Entry<String, Double>> set = hm.entrySet(); //Получаем из ХМ представление в виде Сет
        for (Map.Entry<String, Double> me : set) {          //с которым уже можно работать
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        double balance = hm.get("50Cent");
        hm.put("50Cent", balance + 1.0);
        System.out.println("New balance of 50 Cent: " + hm.get("50Cent"));
    }
}

class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>();       //Создаем ТриМап который харинт обхекты в отсортированном виде
        tm.put("Billie Eillish", 7500.00);                  //по нарастанию ключей
        tm.put("Tom Holland", 117500.00);
        tm.put("Nil Armstrong", 75.30);
        tm.put("50Cent", 0.50);
        tm.put("Alice Cooper", 120.01);

        Set<Map.Entry<String, Double>> ss = tm.entrySet();  //Также получаем представление Сет с которым работаем далее
        for (Map.Entry<String, Double> e : ss) {
            System.out.print(e.getKey() + ": ");
            System.out.println(e.getValue());
        }
        double balance = tm.get("Alice Cooper");
        tm.put("Alice Cooper", balance + 1000.0);
        System.out.println("New balance of Alice Cooper: " + tm.get("Alice Cooper"));
    }
}

