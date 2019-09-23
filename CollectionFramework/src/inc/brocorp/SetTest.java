package inc.brocorp;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>(); //HS не поддерживает порядок ввода данных

        hs.add("Alpha");
        hs.add("Omega");
        hs.add("Beta");
        hs.add("Gamma");
        hs.add("Zetta");

        System.out.println(hs);
    }
}
class LinkedHashSetTest {
    public static void main(String[] args) {
        Set<String> lhs = new LinkedHashSet<>(); //LHS хранит данные в том виде, котором они были введены

        lhs.add("Alpha");
        lhs.add("Beta");
        lhs.add("Gamma");
        lhs.add("Omega");
        lhs.add("Zetta");

        System.out.println(lhs);
    }
}
class TreeSetTest{
    public static void main(String[] args) {
        SortedSet<String> ts = new TreeSet<>(); //TS хранит данные в отсортированном виде

        ts.add("Zetta");
        ts.add("Alpha");
        ts.add("Omega");
        ts.add("Beta");
        ts.add("Gamma");

        System.out.println(ts);
    }
}