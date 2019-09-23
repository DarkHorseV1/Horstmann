package inc.brocorp;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("N");
        al.add("J");
        al.add("F");

        Iterator<String> itr = al.iterator();           //создаем итератор и выводим коллекцию
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element);
        }

        ListIterator<String> liter = al.listIterator(); //Создаем ЛистИтератор позволяющий перебирать коллекцию и
        while (liter.hasNext()) {                       //в обратном порядке
            liter.next();
        }
        while (liter.hasPrevious()) {                   //для коррект. работы метода hasPrevious() необходимо
            String element = liter.previous();          //чтобы LI был в конце коллекции (к прим. после перебора
            liter.set(element + "+");                   //методом hasNext())
        }
        System.out.println(al);
    }
}

class ForEachTest {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<>();

        al.add("A");
        al.add("B");
        al.add("C");
        al.add("K");
        al.add("J");
        al.add("F");

        for (String s : al) {                           //Перебор коллекции с помощиью цикла ForEach
            System.out.println(s);
        }
    }
}

class SpliteratorTest {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(5);
        al.add(11);
        al.add(-9);
        al.add(7);

        System.out.println(al);

        LinkedList<Integer> ll = new LinkedList<>();

        Spliterator<Integer> splt = al.spliterator();
        while (splt.tryAdvance(e -> ll.add(++e))) ;     //Создание новой коллекции с помощью итератора-разделителя

        splt = ll.spliterator();
        splt.forEachRemaining(element -> System.out.print(element + " "));
    }
}