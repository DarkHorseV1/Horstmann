package inc.brocorp;

import java.util.HashMap;

public class EqualsAndHashCode {
    public static void main(String[] args) {

        HashMap<ID, PoliceDepartment> hm = new HashMap<>();
        hm.put(new ID(20, 14), new PoliceDepartment("Chartman", "Sergeant"));
        hm.put(new ID(20, 13), new PoliceDepartment("Wayne", "Captain"));
        hm.put(new ID(20, 15), new PoliceDepartment("McCormick", "Major"));
        hm.put(new ID(11, 35), new PoliceDepartment("Bratlovski", "Sergeant"));

        System.out.println(hm);
    }
}

class PoliceDepartment {
    private String name;
    private String rank;

    @Override
    public String toString() {
        return name + " " + rank + "\n";
    }

    public PoliceDepartment(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }
}

class ID {
    private int departmentId;
    private int unitId;

    /*
    При переопределении Equals необходимо проверить:
    1. ссылаются ли переменные на один и тот же объект
    2. пуст ли объект и перенаделжит ли он тому же классу что и объект вызвавший метод Equals
    после чего можно переходить к сравению по полям
    примитивы можно сравнивать через "==", ссылочные типы данных через Equals
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        ID id = (ID) o;
        return this.departmentId == id.departmentId || this.unitId == id.unitId;
    }

    /*
    Если мы переопределили equals(), то должны переопределить и hashCode().
    В переопределении hashCode() должны учавствовать ВСЕ поля которые исп. в переопределении equals()
    промежуточный результат рекомендуется умножать на простое НЕ четное число
     */

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + departmentId;
        result = 31 * result + unitId;
        return result;
    }

    @Override
    public String toString() {
        return "ID: " + departmentId + "." + unitId + " " + this.hashCode();
    }

    public ID(int departmentId, int unitId) {
        this.departmentId = departmentId;
        this.unitId = unitId;
    }
}