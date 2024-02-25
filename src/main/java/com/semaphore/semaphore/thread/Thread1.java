package com.semaphore.semaphore.thread;

import java.util.concurrent.Semaphore;

public class Thread1 extends Thread {

    private Semaphore semaphore;

    public Thread1(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run () {
        try {
            System.out.println("Before acquiring permit thread 1");
            semaphore.acquire();
            System.out.println("After acquiring permit thread 1");
            semaphore.release();
            System.out.println("After releasing permit thread 1");
        } catch (Exception e) {
            System.out.println("Exception in thread 1");
        }
    }
    
}
