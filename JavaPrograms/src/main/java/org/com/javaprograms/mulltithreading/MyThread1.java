package org.com.javaprograms.mulltithreading;

public class MyThread1 extends Thread{
    @Override
    public void run(){

        try{
            Thread.sleep(8000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread started : " + this.getName());
    }
}
