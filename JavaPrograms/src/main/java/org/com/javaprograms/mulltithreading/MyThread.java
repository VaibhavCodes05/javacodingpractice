package org.com.javaprograms.mulltithreading;

public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("Thread started : " + this.getName());
    }
}
