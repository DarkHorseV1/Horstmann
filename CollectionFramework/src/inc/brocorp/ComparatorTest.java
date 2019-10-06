package inc.brocorp;

import java.util.*;

public class ComparatorTest {
    public static void main(String[] args) {
        TreeSet<Staff> ts = new TreeSet(new Staff().thenComparing((o1, o2) -> o1.getId().compareTo(o2.getId())));
        /*
        В качесте параметра для Tree Set передается кампаратор переопределнный в Staff чтобы сравнивать фамилии,
        если фамилии одинаковые сравнение идет по именам.
        Если имена и фамилии одинаковые с помощью метода thenComparing() создается цепочка компаратаров и
        происходит сравнение по ID
         */
        ts.add(new Staff("004321", "Carpenter Bob", "Охранник"));
        ts.add(new Staff("009112", "Carpenter Jack", "Продавец"));
        ts.add(new Staff("002565", "Suzeen Dora", "Охранник"));
        ts.add(new Staff("001890", "Maddison Owen", "Медик"));
        ts.add(new Staff("003344", "Camel Kim", "Продавец"));
        ts.add(new Staff("006712", "Carpenter Jack", "Деректор"));
        ts.add(new Staff("001213", "Carpenter Abraham", "Заместитель"));
        ts.add(new Staff("004001", "Abdornee Patrick", "Продавец"));


        for (Staff o : ts) {
            System.out.println(o);
        }
    }
}

class Staff implements Comparator<Staff> {
    private String id;
    private String name;
    private String employeePosition;

    public Staff(String id, String name, String employeePosition) {
        this.id = id;
        this.name = name;
        this.employeePosition = employeePosition;
    }

    public Staff() {
    }

    @Override
    public int compare(Staff o1, Staff o2) {
        int i, j, k;
        k = o1.name.compareTo(o2.name);
        if (k == 0) {
            i = o1.name.lastIndexOf(' ');
            j = o2.name.lastIndexOf(' ');
            return o1.name.substring(i).compareToIgnoreCase(o2.name.substring(j));
        } else return k;
    }

    @Override
    public String toString() {
        return "ID = " + id + ", Name = " + name + ", Position = " + employeePosition + ";";
    }

    public String getId() {
        return id;
    }
}