package inc.brocorp;

import java.util.*;

public class CollectionTest {

    List<String> collection = new LinkedList<>();
    {
        collection.add("Mike");
        collection.add("Mitrich");
        collection.add("Mikeladen");
        collection.add("Michael");

    }
    public static void main(String []args){
        CollectionTest ct = new CollectionTest();
        //Создание объекта итератора на основе колекции
        Iterator<String> iter = ct.collection.iterator();


        //Сортировка с помощью итератора (Java<1.5)
        while(iter.hasNext()){
            String element = iter.next();
            System.out.println(element);
        }
        System.out.println("1-----------");

        //Соритоировка с помощью цикла Foreach
        for(String s : ct.collection){
            System.out.println(s);
        }
        System.out.println("2-----------");

        //Соритоировка с помощью лямбда-выражения
        iter.forEachRemaining(element -> System.out.println(element));
    }
}
