package inc.brocorp;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("G");
        ll.addFirst("B");           //добавляем эллемент в начало
        ll.addLast("Z");            //добаляем эллемент в конец
        ll.add(1, "Y");   // добав. эл-нт по индексу

        System.out.println("Linked List contents: " + ll);

        ll.remove("Z");
        ll.remove(1);
        ll.removeLast();
        ll.removeFirst();

        System.out.println("New Linked List: " + ll);
    }
}

class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(11);
        al.add(-9);
        al.add(7);

        System.out.println("Array List contents: " + al);

        Integer[] intArray = new Integer[al.size()];
        intArray = al.toArray(intArray);
        int summ = 0;
        for (int i : intArray) {
            summ += i;
        }
        System.out.println("Summ = " + summ);
    }
}