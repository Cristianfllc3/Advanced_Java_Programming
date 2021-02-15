package Generics;

public class test {
    public static void main(String[] args) {

        SampleDemo a = new SampleDemo("A");
        SampleDemo b = new SampleDemo("B");

        a.start();
        b.start();

    }

}

class SampleDemo implements Runnable {
    private Thread t;
    private String threadName;

    SampleDemo(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        while (true)
            System.out.println(threadName);
    }

    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}