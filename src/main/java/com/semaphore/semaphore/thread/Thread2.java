package com.semaphore.semaphore.thread;

import java.util.concurrent.Semaphore;

public class Thread2 extends Thread {

    private Semaphore semaphore;

    public Thread2(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run () {
        try {
            System.out.println("Before acquiring permit thread 2");
            semaphore.acquire();
            System.out.println("After acquiring permit thread 2");
            semaphore.release();
            System.out.println("After releasing permit thread 2");
        } catch (Exception e) {
            System.out.println("Exception in thread 2");
        }
    }
    
}
