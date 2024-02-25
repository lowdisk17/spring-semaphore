package com.semaphore.semaphore.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

import org.springframework.stereotype.Service;

import com.semaphore.semaphore.thread.Thread1;
import com.semaphore.semaphore.thread.Thread2;
import com.semaphore.semaphore.thread.Thread3;
import com.semaphore.semaphore.thread.Thread4;

@Service
public class MainService {

    private Semaphore semaphore = new Semaphore(2);
    private ExecutorService es = Executors.newFixedThreadPool(10);

    public void executeProcess () {
        es.submit(new Thread1(semaphore));
        es.submit(new Thread2(semaphore));
        es.submit(new Thread3(semaphore));
        es.submit(new Thread4(semaphore));
        System.out.println("All threads submitted to executor service");
    }
    
}
