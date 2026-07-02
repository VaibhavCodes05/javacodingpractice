package org.com.javaprograms.mulltithreading;

public class App {

    public static void main(String[] args) throws InterruptedException {

        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();

        t1.start();

        t2.start();

        t1.join();
        t2.join();

   //     t1.start();    -> THrows IllegalStateException
//        Thread started : Thread-0
//        Thread started : Thread-1
//        Exception in thread "main" java.lang.IllegalThreadStateException
//        at java.base/java.lang.Thread.start(Thread.java:800)
//        at org.com.javaprograms.mulltithreading.App.main(App.java:17)

        System.out.println("Thread finished "+ Thread.currentThread().getName());

//        MyThread2 t3 = new MyThread2();
        Thread t4 = new Thread(() -> {
            System.out.println("MyThread2 is running");
        });

    }
}
