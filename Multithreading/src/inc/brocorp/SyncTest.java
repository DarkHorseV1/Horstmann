package inc.brocorp;

public class SyncTest {
    public static void main(String[] args) {
        CallMe target = new CallMe();

        Caller obj1 = new Caller(target, "Добро пожаловать в");

        Caller obj2 = new Caller(target, "синхронизации");
        obj2.t.setPriority(Thread.MAX_PRIORITY);                //Повышам приоретет потока до максимума - 10

        Caller obj3 = new Caller(target, "мир");
        obj3.t.setPriority(Thread.MIN_PRIORITY);                //Понижаем приоритет до минимума - 1

        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Caller implements Runnable {
    Thread t;
    String msg;
    CallMe cm;

    Caller(CallMe cm, String msg) {
        this.msg = msg;
        this.cm = cm;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (cm) {
            cm.call(msg);
        }

    }
}

/*
В методе run() создается синхронизированный блок которому в кач. параметра передается объект.
Методы данного объекта будут исполнены если исполняющий поток сможет войти в монитор объекта
альтернативой будетсоздание синхронизированного метода call() .
 */

class CallMe {
    public void call(String msg) {          //добавить модификатор synchronized
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception");
        }
        System.out.println("]");
    }
}