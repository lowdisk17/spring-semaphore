package com.semaphore.semaphore.thread;

import java.util.concurrent.Semaphore;

public class Thread3 extends Thread {

    private Semaphore semaphore;

    public Thread3(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run () {
        try {
            System.out.println("Before acquiring permit thread 3");
            semaphore.acquire();
            System.out.println("After acquiring permit thread 3");
            semaphore.release();
            System.out.println("After releasing permit thread 3");
        } catch (Exception e) {
            System.out.println("Exception in thread 3");
        }
    }
    
}
