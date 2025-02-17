package com.reflection.advancedlevel;

public class Client {
    @Inject
    private Service service;

    public void doWork() {
        service.serve();
    }
}
