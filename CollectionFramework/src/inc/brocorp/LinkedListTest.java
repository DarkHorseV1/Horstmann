package inc.brocorp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Mary");
        a.add("Jane");
        a.add("Sara");
        a.add("Taylor");

        List<String> b = new LinkedList<>();
        b.add("Cory");
        b.add("Connor");
        b.add("Swift");
        b.add("Scout");

        //ListIterator позволяет перебирать коллекцию и сначала и с конца
        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        //Объеденяем две коллекции
        while(bIter.hasNext()){
            if(aIter.hasNext())aIter.next();
            aIter.add(bIter.next());
        }
        System.out.println(a);

        //Удаляем из коллекции Б каждый второй элемент
        bIter = b.iterator();
        while(bIter.hasNext()){
            bIter.next();
            if(bIter.hasNext()){
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b);

        //Удаляем из к. А два эл-та из к. Б
        a.removeAll(b);
        System.out.println(a);
    }
}
