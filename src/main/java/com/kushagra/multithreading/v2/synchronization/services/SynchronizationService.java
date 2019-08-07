package com.kushagra.multithreading.v2.synchronization.services;

import com.kushagra.multithreading.v2.synchronization.models.IdGenerator;
import com.kushagra.multithreading.v2.synchronization.models.SynchronizedIdGenerator;
import org.springframework.stereotype.Service;

@Service
public class SynchronizationService {

    public void generateId() {
        IdGenerator idGenerator = new IdGenerator();

        Thread thread1 = new Thread(idGenerator);
        Thread thread2 = new Thread(idGenerator);
        Thread thread3 = new Thread(idGenerator);

        thread1.setName("Thread1");
        thread2.setName("Thread2");
        thread3.setName("Thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

    public void generateIdSynchronized() {
        SynchronizedIdGenerator idGenerator = new SynchronizedIdGenerator();

        Thread thread1 = new Thread(idGenerator);
        Thread thread2 = new Thread(idGenerator);
        Thread thread3 = new Thread(idGenerator);

        thread1.setName("Thread1");
        thread2.setName("Thread2");
        thread3.setName("Thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
