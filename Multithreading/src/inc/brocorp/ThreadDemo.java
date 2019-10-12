package inc.brocorp;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Supreme thread is started.");

        /*
        Создается аноним. объект класса NewThread и запускается на выполнение его поток.
        После "главный" поток выводит на надпись на экран с задержкой в 1 сек.
         */

        new NewThread();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Supreme thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException o) {
            System.out.println("Supreme thread exception");
        }
        System.out.println("Supreme thread is done!");
    }
}

class NewThread implements Runnable {
    Thread t;

    /*
    в констурктое создается объект класса Thread, которму с помощью слова З передается преопределенный метод run()
    задется имя потока.
    Поток запускается помощиью метода start(). Фактически start() вызывает run().
     */

    NewThread() {
        t = new Thread(this, "My thread");
        System.out.println("Thread created.");
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("My thread: " + i);
                Thread.sleep(500);                  //sleep() может выбрасывать InterruptedException если
            }                                            //будет возобновлен в другом потоке
        } catch (InterruptedException e) {
            System.out.println("Thread exception");
        }
        System.out.println("My thread is done!");
    }
}