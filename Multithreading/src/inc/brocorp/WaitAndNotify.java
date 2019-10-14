package inc.brocorp;

public class WaitAndNotify {
    public static void main(String[] args) {
        Mail mail = new Mail();
        new Producer(mail);
        new Consumer(mail);
    }
}

class Producer implements Runnable {
    Mail m;

    Producer(Mail m) {
        this.m = m;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i = 0;
        while(true){
            m.send(i++);
        }
    }

}

class Consumer implements Runnable {
    Mail m;
    Consumer(Mail m ){
        this.m = m;
        new Thread(this, "Consumer").start();
    }
    @Override
    public void run() {
        while(true){
            m.get();
        }
    }
}

class Mail {
    int n;
    boolean valueSet = false;

    public synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Получено: " + n);
        valueSet = false;
        notify();
        return n;
    }

    public synchronized void send(int n) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n = n;
        System.out.println("Отправлено: " + n);
        valueSet = true;
        notify();
    }
}