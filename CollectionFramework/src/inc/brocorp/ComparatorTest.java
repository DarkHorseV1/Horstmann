package inc.brocorp;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTest {
    public static void main(String[] args) {
        MyComp mc = new MyComp();
        TreeSet<String> ts = new TreeSet(mc.reversed());
        ts.add("U");
        ts.add("B");
        ts.add("C");
        ts.add("F");
        ts.add("A");

        for (String o : ts) {
            System.out.println(o);
        }
    }
}

class MyComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        return aStr.compareTo(bStr);
    }
}