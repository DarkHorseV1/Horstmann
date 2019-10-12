package inc.brocorp;

public class IsAliveAndJoin {
    public static void main(String[] args) {
        System.out.println("Supreme thread is started.");

        MyThread obj1 = new MyThread("First");
        MyThread obj2 = new MyThread("Second");

        /*
        C помощью логического метода isAlive() проверятся, исполняется ли поток.
        Благодоря методу join() "главный" поток программы ожидает их завершения.
         */

        try {
            obj1.t.join();
            obj2.t.join();
        } catch (InterruptedException o) {
            System.out.println("Supreme thread exception");
        }
        System.out.println(obj1.name + " is " + obj1.t.isAlive());
        System.out.println(obj2.name + " is " + obj2.t.isAlive());
        System.out.println("Supreme thread is done!");
    }
}

class MyThread implements Runnable {
    String name;
    Thread t;

    MyThread(String name) {
        this.name = name;
        t = new Thread(this, name);
        t.start();
        System.out.println("Is the " + name + " created?: " + t.isAlive());
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread exception");
        }
        System.out.println("My " + name + " thread is done!");
    }
}